def final(a):
    fact=1
    for i in range(1,a+1):
        fact=fact*i
    return fact
d={}
a=int(input("enter the number of key's:"))
for x in range(1,a+1):
    k=int(input("enter the key :"))
    d[k]=final(k)
print(d)
