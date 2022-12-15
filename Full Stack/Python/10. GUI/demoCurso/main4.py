import tkinter
from tkinter import filedialog

# Abri ventana de archivos
window = tkinter.Tk()
filename = filedialog.askopenfilename()
window.mainloop()
