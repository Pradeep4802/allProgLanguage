x=int(input("enter number of keys of first dictionary:"))
first={}
for i in range(1,x+1):
    n=int(input("enter the keys :"))
    first[n]=n*10
y=int(input("enter number of keys of second dictionary :"))
second={}
for i in range(1,y+1):
    n=int(input("enter the of keys:"))
    second[n]=n*10
z=int(input("enter number of keys of three dictionary :"))
three={}
for i in range(1,z+1):
    n=int(input("enter the of keys:"))
    three[n]=n*10
for i in second:
    first[i]=second[i]
for i in three:
    first[i]=three[i]
print(first)
