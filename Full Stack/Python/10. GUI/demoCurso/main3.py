import random
import tkinter
from tkinter import ttk

window = tkinter.Tk()

colors = ['blue', 'red', 'yellow', 'purple', 'green', 'black']

for x in range(0, 10):
    color = random.randint(0, len(colors) - 1)
    color2 = random.randint(0, len(colors) - 1)
    label = tkinter.Label(window, text="etiqueta!", bg=colors[color], fg=colors[color2])
    label.place(x=random.randint(0, 100), y=random.randint(0, 100))

# label1 = tk.Label(window, text="Posicionamiento absoluto", bg="blue", fg="white")
# label1.place(x=10, y=50)

# label2 = tk.Label(window, text="Posicionamiento absoluto", bg="red", fg="yellow")
# label2.place(relx=0.10, rely=0.15, relwidth=0.5, anchor='ne')
# label2.place(x=25, y=30)

window.mainloop()
