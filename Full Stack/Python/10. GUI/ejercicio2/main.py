import tkinter

window = tkinter.Tk()
selected = tkinter.StringVar()

lista = ['Windows', 'macOS', 'Linux', 'MS DOS', 'AmigaOS', 'BeOS', 'DS/2']
lista_items = tkinter.StringVar(window, '0')

label = tkinter.Label(window, text="Sistema operativo seleccionado: ")
label.grid(column=0, row=0)
label2 = tkinter.Label(window, text="")
label2.grid(column=1, row=0)


def seleccionar():
    label2.config(text=lista[int(lista_items.get()) - 1])


def reset():
    lista_items.set(None)
    label2.config(text="")


contador = 0

for nombre in lista:
    r = tkinter.Radiobutton(window, text=nombre, value=contador + 1, variable=lista_items, command=seleccionar)
    r.grid(column=0, row=contador + 1, sticky=tkinter.W)
    contador += 1

button = tkinter.Button(window, text="Reiniciar", command=reset)
button.grid(column=2)
window.mainloop()
