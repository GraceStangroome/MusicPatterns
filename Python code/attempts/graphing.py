# idk what this is supposed to do but it doesn't work lol
import matplotlib.pyplot as plt
import numpy as np

content = [ -12,  -49, -31, 114,  -87, -113]
fig, ax = plt.subplots()  # 7:05
x = np.arange(0, 2 * (4096), 2)
line, = ax.plot(x, np.random.rand(4096))
ax.set_ylim(0, 255)
ax.set_xlim(0, 4096)

while True:
    line.set_ydata(content)
    fig.canvas.draw()
    fig.canvas.flush_events()
