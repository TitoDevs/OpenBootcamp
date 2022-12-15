import sys
import tkinter
from tkinter import ttk


def mifuncion():
    print("clicado")


window = tkinter.Tk()


def saludar(event):
    print("Han hecho click en saludar")


def saludardobleclick(event):
    print("Han hecho doble click en saludar")

def salir(event):
    window.quit()

boton = tkinter.Button(window, text="Haz click")
boton.pack()
boton.bind('<Button-1>', saludar)
boton.bind('<Double-1>', saludardobleclick)

botonsalir = tkinter.Button(window, text="Salir")
botonsalir.pack()
botonsalir.bind('<Button-1>', salir)

# window.columnconfigure(0, weight=1)
# window.columnconfigure(1, weight=3)

# selected = tkinter.StringVar()
# checkbox = ttk.Checkbutton(window, text="Acepto las condiciones", variable=selected, command=mifuncion)
# checkbox.grid(column=0, row=0)


# r1 = ttk.Radiobutton(window, text='Si', value='1', variable=selected)
# r2 = ttk.Radiobutton(window, text='No', value='2', variable=selected)
# r3 = ttk.Radiobutton(window, text='Quizas', value='3', variable=selected)

# r1.grid(column=0, row=1, pady=5, padx=5)
# r2.grid(column=0, row=2, pady=5, padx=5)
# r3.grid(column=0, row=3, pady=5, padx=5)

# selected2 = tkinter.StringVar()
# rs1 = ttk.Radiobutton(window, text='Si', value='1', variable=selected2)

# rs1.grid(column=1, row=0, pady=5, padx=5)

# frame = ttk.Frame(window)

# lista = ['Windows', 'macOS', 'Linux', 'MS DOS', 'AmigaOS', 'BeOS', 'DS/2']
# lista_items = tkinter.StringVar(value=lista)
# listbox = tkinter.Listbox(window, height=100, listvariable=lista_items)


# label = ttk.Label(frame, text="hola")
# label.grid(column=0, row=0, sticky=tkinter.W, padx=50, pady=50)

# listbox.grid(column=0, row=0, sticky=tkinter.W)
window.mainloop()
sys.exit(0)

## USUARIO

# Etiqueta usuario
username_label = ttk.Label(window, text="Username:")
username_label.grid(column=0, row=0, sticky=tkinter.W, padx=5, pady=5)

# Campo usuario
username_entry = ttk.Entry(window)
username_entry.grid(column=1, row=0, sticky=tkinter.E, padx=5, pady=5)

# Etiqueta password
password_label = ttk.Label(window, text="Password:")
password_label.grid(column=0, row=1, sticky=tkinter.W, padx=5, pady=5)

# Campo password
password_entry = ttk.Entry(window, show='*')
password_entry.grid(column=1, row=1, sticky=tkinter.E, padx=5, pady=5)

# Button
login_button = ttk.Button(window, text="Login")
login_button.grid(column=1, row=3, sticky=tkinter.E, padx=5, pady=5)

window.mainloop()
