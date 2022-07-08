def addition(a,b):
    c=a+b
    print(a,"+",b,"=",c)

def multiply(a,b):
    c = a * b
    return c

x = int(input("Enter the number:"))
y = int(input("Enter the number:"))

addition(x,y)

print(x,"*",y,"=",multiply(x,y))