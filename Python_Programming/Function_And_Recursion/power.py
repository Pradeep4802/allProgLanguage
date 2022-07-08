def power(a,b):
    z = 1
    for i in range(1,b+1):
        z*=a
    return z

x = int(input("Enter the number:"))
y = int(input("Enter the number:"))

print(power(x,y))