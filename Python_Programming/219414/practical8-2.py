from tkinter import *
root = Tk()
l1=Label(root,text="enter number :")
l1.place(x=13,y=30)

e1=Entry(root,bd='2')
e1.place(x=150,y=30)

def myfun():
    n=int(e1.get())
    x=int(n%10)
    rev=0
    a=0

    while(n>0):
        a=int(n%10)
        n=int(n/10)
        rev=rev*10+a
    if(x==rev):
        h=(str(x)+"is a palindrome")
        root1.config(text=h)
    else:
        h=(str(x)+"is not palindrome")
        root1.config(text=h)

b1=Button(root,text="palindrome",command=myfun)
b1.place(x=100,y=120)

root1=Label(root,fg="green")
root1.place(x=80,y=200)

root.geometry("300x300")
root.mainloop()

