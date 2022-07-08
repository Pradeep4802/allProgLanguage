f1 = open("abc.txt","w")
n = input("Enter the text")
f1.write(n)
f2 = open("xyz.txt","w")
n = input("Enter the text: ")
f2.write(n)
f1.close()
f2.close()
l = []
f1 = open("abc.txt","r")
s1 = f1.read()
for i in s1:
    l.append(i)

f2 = open("xyz.txt","r")
s2 = f2.read()
for i in s2:
    l.append(i)

print("File contents ",l)
f1.close()
f2.close()