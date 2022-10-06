import tkinter
from tkinter import ttk

window = tkinter.Tk()
selected = tkinter.StringVar()

lista = ['Windows', 'macOS', 'Linux', 'MS DOS', 'AmigaOS', 'BeOS', 'DS/2']
lista_items = tkinter.StringVar(value=0)
contador = 0
for nombre in lista:
    r = tkinter.Radiobutton(window, text=nombre, value=contador + 1, variable=lista_items)
    r.grid(column=0, row=contador, sticky=tkinter.W)
    contador += 1


def reiniciar():
    global lista_items = tkinter.StringVar(value=0)
    contador = 0


button = tkinter.Button(window, text="Reiniciar")
button.bind('<Button-1>', reiniciar())
button.grid(column=1)
window.mainloop()
