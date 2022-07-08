from tkinter import *
from tkinter import messagebox
top = Tk()

top.geometry("500x500")
def helloCallBack():
    msg = messagebox.showinfo( "Hello python", "Hello world")
B = Button(top, text = "Hello", command =  helloCallBack)
B.place(x=100,y=100)
top.mainloop()