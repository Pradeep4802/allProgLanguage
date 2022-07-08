from tkinter import *
root = Tk()

l1=Label(root,text="enter the number :",font=("calibari",11,"bold"))
l1.place(x=13,y=30)

e1=Entry(root,bd="2")
e1.place(x=150,y=30)

def square():
    n=int(e1.get())
    sq = 0
    for i in range(n):
        sq = n * n  
    m=("sqaure is :"+str(sq))
    x.config(text=m)

def cube():
    z=int(e1.get())
    f=0
    for i in range(z):
        f=z*z*z
    m=("cube is :"+str(f))
    x.config(text=m)

b1 = Button(root,text="Square",font=("calibari",10,"bold"),bg="yellow",command=square)
b1.place(x=100,y=180)

c1 = Button(root,text="Cube",font=("calibari",10,"bold"),bg="yellow",command=cube)
c1.place(x=100,y=120)

x=Label(root,fg="green",font=("calibary",13,"bold"))
x.place(x=80,y=200)

root.geometry("300x300")
root.mainloop()
