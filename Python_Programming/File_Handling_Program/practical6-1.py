class fill():
    def getfill(self,a):
        self.a=a

class fillb():
    def getfillb(self,b):
        self.b=b

class calculation(fill,fillb):
    def cal(self):
        add=self.a+self.b
        sub=self.a-self.b
        mul=self.a*self.b
        div=self.a/self.b
        print("Adition is :",add)
        print("subtraction is :",sub)
        print("multiplication is :",mul)
        print("division is:",div)

a=int(input("enter first number :"))
b=int(input("enter second number :"))

obj=calculation()
obj.getfill(a)
obj.getfillb(b)
obj.cal()

        
        
