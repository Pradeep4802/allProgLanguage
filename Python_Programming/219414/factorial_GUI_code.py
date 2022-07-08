from tkinter import*
root = Tk()
L1 = Label(root,text = "ENter the Number:",font=('calibari',11,'bold'))
L1.place(x=13,y=30)
E1 = Entry(root,bd='2')
E1.place(x=150,y=30)
def fact():
    n = int(E1.get())
    f = 1
    for i in range(1,n+1):
        f = f * i
    m = ("Factorial is:"+str(f))
    x.config(text=m)
B1 = Button(root,text = "Factorial",command=fact,font=('calibari',10,'bold'),bg='cyan')
B1.place(x=100,y=120)
x = Label(root,fg='red',font=('calibari',13,'bold'))
x.place(x = 80,y = 210)
root.geometry("300x300")
root.mainloop()