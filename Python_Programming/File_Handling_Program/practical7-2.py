class a:
    def infoA(self):
        print("function of class a\n")

class b(a):        
    def infoB(self):
        print("function of class b\n")

class c(b):
    def infoC(self):
        print("function of class c\n")

obj=c()
obj.infoA()
obj.infoB()
obj.infoC()
