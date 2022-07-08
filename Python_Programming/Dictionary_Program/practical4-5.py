x=int(input("enter number of keys of first dictionary:"))
first={}
for i in range(1,x+1):
    n=int(input("enter the keys :"))
    first[n]=n*n
y=int(input("enter number of keys of second dictionary :"))
second={}
for i in range(1,y+1):
    n=int(input("enter the of keys:"))
    second[n]=n*n
marge={}
for i in first:
    marge[i]=first[i]
for i in second:
    marge[i]=second[i]
print(marge)
