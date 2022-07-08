n=int(input("enter the number of elements: "))
l=[]
for i in range(1,n+1):
    a=input("enter the elements: ")
    l.append(a)
print("list",l)
f=open("merge.txt","w")
for i in l:
    f.write(str(i))
f.close()
