""" The code found here: https://www.youtube.com/watch?v=AShHJdSIxkY but modified to be more suited for this.
 This code is designed to take input from the microphone and represent it as an integer for further processing. """
# import statements
import pyaudio
import struct  # unpacks as integers and not binary which should allow better interpretation
import numpy as np  # to make it look more like a wave form if plotted
import keyboard  # allows the program to detect a key press to stop iterations

# variables
CHUNK = 1024 * 4  # how much audio is processed at one time
FORMAT = pyaudio.paInt16  # Bytes per sample
CHANNELS = 1  # monoaural i.e. just the one microphone
RATE = 44100  # samples per second. 44100 is just most common
output = open("E:/MusicPatterns Git/MusicPatterns/data.csv"", "a")  # saves data to be accessed by processing file.
stream = pyaudio.PyAudio().open(format=FORMAT, channels=CHANNELS, rate=RATE, input=True, output=True, frames_per_buffer=CHUNK)  # Setting up the stream

# The program
while True:  # to loop continuously
    try:
        if keyboard.is_pressed("s"):
            output.close()  # for a clean ending
            break  # finishing the loop
        else:
            data = stream.read(CHUNK)  # which will be in bytes, and therefore needs converting
            data_int = np.array(struct.unpack(str(2 * CHUNK) + 'B', data), dtype='b')[::2] + 127  # 2*CHUNK because len(data) is double CHUNK and we want to pass all the data, and put it into a numpy array.
            # b is an integer from 0 to 255, so when we add half this (127) it will just wrap back around. [::2] also helps smooth out the data. A string
            for i in data_int:  # to write each number separately in the string
                print(i)
                output.writelines("{},".format(str(i)))  # data needs to be a string to be written to a file
    except KeyboardInterrupt as error:  # Error exception
        output.close()
        break  # so essentially stops if any key is pressed.
