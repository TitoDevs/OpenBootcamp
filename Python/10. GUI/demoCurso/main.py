import tkinter

window = tkinter.Tk()

label1 = tkinter.Label(window, text="label1", bg="yellow", fg="blue")
label1.pack(ipadx=45, ipady=15, fill='x')

label2 = tkinter.Label(window, text="label2", bg="purple", fg="white")
label2.pack(ipadx=45, ipady=15, fill='x')

label3 = tkinter.Label(window, text="label3", bg="blue", fg="white")
label3.pack(ipadx=45, ipady=15, fill='x')

label4 = tkinter.Label(window, text="label4", bg="red", fg="white")
label4.pack(ipadx=15, ipady=15, side="left")

label5 = tkinter.Label(window, text="label5", bg="yellow", fg="black")
label5.pack(ipadx=15, ipady=15, side="left")

label6 = tkinter.Label(window, text="label6", bg="green", fg="white")
label6.pack(ipadx=15, ipady=15, side="right")


window.mainloop()
