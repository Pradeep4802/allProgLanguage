from tkinter import *
from tkinter import messagebox
 
top = Tk()
top.resizable("false","false")
top.title("Calculator")
n1=0
n2=0
i=0
opr=""

E1 = Entry(top, bd =4,font=("calibari",16,"bold"),bg="powder blue") 
E1.pack(side = RIGHT)
E1.place(x=120,y=20)
top.geometry("400x400")
def add():
   global n1
   global opr
   n1=int(E1.get())
   opr="+"
   E1.delete(0,END)

B1=Button(top, text =" + ", relief=RIDGE, bd=2,command =add,padx=20,bg="yellow",font=("calibari",15,"bold") ) 
B1.place(x=20,y=160)

def sub():
   global n1
   global opr
   n1=int(E1.get())
   opr="-"
   E1.delete(0,END)
   
B2=Button(top, text =" - ",relief=RIDGE, bd=2, command = sub,padx=22,bg="yellow",font=("calibari",15,"bold") ) 
B2.place(x=110,y=160)

def mul():
   global n1
   global opr
   n1=int(E1.get())
   opr="*"
   E1.delete(0,END)
   
B3=Button(top, text =" * ",relief=RIDGE, bd=2, command = mul, padx=22, bg="yellow", font=("calibari",15,"bold") ) 
B3.place(x=200,y=160)

def div():
   global n1
   global opr
   n1=int(E1.get())
   opr="/"
   E1.delete(0,END)
   
B4=Button(top, text =" / ", relief=RIDGE,bd=2, command = div , padx=23,bg="yellow",font=("calibari",15,"bold")) 
B4.place(x=290,y=160)

def one(t):
   global i
   E1.insert(i,t)
   i=i+1
   
def clear():
   E1.delete(0,END)
   

def equal():
   n2=int(E1.get())
   if opr=="+":
      n=n1+n2
   if opr=="-":
      n=n1-n2
   if opr=="*":
      n=n1*n2
   if opr=="/":
      n=n1/n2
   E1.delete(0,END)
   E1.insert(0,str(n))
   

B5=Button(top, text =" 1 ", relief=RIDGE,bd=2 , command=lambda t="1":one(t), padx=22, fg="white", bg="grey",font=("calibari",15,"bold")) 
B5.place(x=20,y=215)

B6=Button(top, text =" 2 " ,relief=RIDGE, bd=2, command=lambda t="2":one(t) , padx=22, fg="white", bg="grey",font=("calibari",15,"bold")) 
B6.place(x=110,y=215)

B7=Button(top, text =" 3 ", relief=RIDGE,bd=2, command=lambda t="3":one(t) , padx=22, fg="white", bg="grey",font=("calibari",15,"bold")) 
B7.place(x=200,y=215)

B8=Button(top, text =" 4 ",relief=RIDGE, bd=2, command=lambda t="4":one(t) , padx=21, fg="white", bg="grey",font=("calibari",15,"bold")) 
B8.place(x=290,y=215)

B9=Button(top, text =" 5 ",relief=RIDGE, bd=2, command=lambda t="5":one(t) , padx=22, fg="white", bg="grey",font=("calibari",15,"bold")) 
B9.place(x=20,y=265)

B10=Button(top, text =" 6 ",relief=RIDGE, command=lambda t="6":one(t), bd=2 , padx=22, fg="white", bg="grey",font=("calibari",15,"bold")) 
B10.place(x=110,y=265)

B11=Button(top, text =" 7 ",relief=RIDGE, command=lambda t="7":one(t), bd=2 , padx=22, fg="white", bg="grey",font=("calibari",15,"bold")) 
B11.place(x=200,y=265)

B12=Button(top, text =" 8 ",relief=RIDGE, command=lambda t="8":one(t), bd=2 , padx=22, fg="white", bg="grey",font=("calibari",15,"bold")) 
B12.place(x=290,y=265)

B13=Button(top, text =" 9 ",relief=RIDGE, command=lambda t="9":one(t), bd=2 , padx=22, fg="white", bg="grey",font=("calibari",15,"bold")) 
B13.place(x=20,y=315)

B14=Button(top, text ="  C ",relief=RIDGE, command=clear, bd=2 , padx=22, fg="white", bg="grey",font=("calibari",15,"bold")) 
B14.place(x=110,y=315)

B16=Button(top, text =" 0 ",relief=RIDGE, command=lambda t="0":one(t), bd=2 , padx=22, fg="white", bg="grey",font=("calibari",15,"bold")) 
B16.place(x=200,y=315)

B15=Button(top, text =" = ", relief=RIDGE, command=equal,bd=2 , padx=22, fg="black", bg="light green",font=("calibari",15,"bold")) 
B15.place(x=290,y=315)
top.mainloop() 
