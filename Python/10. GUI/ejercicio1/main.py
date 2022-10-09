import tkinter

window = tkinter.Tk()
selected = tkinter.StringVar()

lista = ['Windows', 'macOS', 'Linux', 'MS DOS', 'AmigaOS', 'BeOS', 'DS/2']
lista_items = tkinter.StringVar(window, '1')


def seleccionar():
    print(lista[int(lista_items.get()) - 1])


def reset():
    lista_items.set(None)


contador = 0

for nombre in lista:
    r = tkinter.Radiobutton(window, text=nombre, value=contador + 1, variable=lista_items, command=seleccionar)
    r.grid(column=0, row=contador, sticky=tkinter.W)
    contador += 1

button = tkinter.Button(window, text="Reiniciar", command=reset)
button.grid(column=1)
window.mainloop()
