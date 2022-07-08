import tkinter 
top = tkinter.Tk()
l1=tkinter.Label(top,text="value 1:")
l1.pack(side=tkinter.LEFT)
l1.place(x=15,y=40)

e1=tkinter.Entry(top,bd=8)
e1.pack(side=tkinter.RIGHT)
e1.place(x=80,y=40)

l2=tkinter.Label(top,text="value 2:")
l2.pack(side=tkinter.LEFT)
l2.place(x=15,y=120)

e2=tkinter.Entry(top,bd=8)
e2.pack(side=tkinter.RIGHT)
e2.place(x=80,y=120)

top.geometry("420x420")
from tkinter import messagebox
def add():
    c=int (el.get ()) +int(e2.get())
    a=("Addition is: ", str (c))
    msg=messagebox.showinfo ("Calculator", a)
B=tkinter.Button(top, text="+", command = add )
B.place(x=50, y=200)

def sub():
    c=int(El.get ())-int (E2.get())
    s=("Subtraction is: ", str (c))
    msg=messagebox.showinfo('Calculator', s)
B=tkinter.Button (top, text="-", command=sub)
B.place (x=110, y=200)

def mul():
    c=int (el.get ()) * int(e2.get())
    a=("multiplication is: ", str (c))
    msg=messagebox.showinfo ("Calculator", a)
B=tkinter.Button(top, text="x", command = mul )
B.place(x=170, y=200)

def div():
    c=int(El.get ())/int (E2.get())
    s=("division is: ", str (c))
    msg=messagebox.showinfo('Calculator', s)
B=tkinter.Button (top, text="/", command=div)
B.place (x=230, y=200)



top.mainloop()
