def reverse(Number):
    Reverse = 0
    while(Number > 0):
        Reminder = Number %10
        Reverse = (Reverse *10) + Reminder
        Number = Number //10
    return Reverse
d={}
a=int(input("enter the number of key's:"))
for x in range(1,a+1):
    k=int(input("enter the key :"))
    d[k]=reverse(k)

print(d)
