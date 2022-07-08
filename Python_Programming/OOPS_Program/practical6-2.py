class complex:
    def __init__(self,imag,real):
        self.r=real
        self.i=imag
    def add(self,obj):
        c3=complex(0,0)
        c3.real=self.r+obj.r
        c3.imag=self.i+obj.i
        return c3


r1=int(input("enter the 1st real number :"))
i1=int(input("enter the 1st imaginary number :"))
r2=int(input("enter the 2nd real number :"))
i2=int(input("enter the 2nd imaginary number :"))

c1=complex(r1,i1)
c2=complex(r2,i2)

c3=c1.add(c2) or c1.add(c1)

print(c3.real)
print(c3.imag)
