""" The code found here: https://www.youtube.com/watch?v=AShHJdSIxkY but modified to be more suited for this
This code needs to have something iterative to make it real time, as this version does it once only. """
# import statements
import pyaudio
import struct  # unpacks as integers and not binary which should allow better interpretation
import numpy as np  # to make it look more like a wave form if plotted

# variables
CHUNK = 1024 * 4  # how much audio is processed at one time
FORMAT = pyaudio.paInt16  # Bytes per sample
CHANNELS = 1  # monoaural i.e. just the one microphone
RATE = 44100  # samples per second. 44100 is just most common

# main object
p = pyaudio.PyAudio()
stream = p.open(format=FORMAT, channels=CHANNELS, rate=RATE, input=True, output=True, frames_per_buffer=CHUNK)

# processing result
data = stream.read(CHUNK)  # which will be in bytes, and therefore needs converting
data_int = np.array(struct.unpack(str(2 * CHUNK) + 'B', data), dtype='b')[::2] + 127 # 2*CHUNK because len(data) is double CHUNK and we want to pass all the data, and put it into a numpy array.
# b is an integer from 0 to 255, so when we add half this (127) it will just wrap back around. [::2] also helps smooth out the data
print(data)
print(data_int)

# output to java
data_output = str(data_int)
output = open("E:/Portfolio/Music Patterns/data.txt", "w")
output.write(data_output)
