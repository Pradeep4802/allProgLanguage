f1=open("abc.txt","w")
n=input("enter the text :")
f1.write(n)
f2=open("xyz.txt","w")
n=input("enter the text :")
f2.write(n)
f1.close()
f2.close()
list1=[]
f1=open("abc.txt","r")
s1=f1.read()
for i in s1:
    list1.append(i)
f2=open("abc.txt","r")
s2=f2.read()
for i in s2:
    list1.append(i)
