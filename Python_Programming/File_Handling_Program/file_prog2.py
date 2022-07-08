# Write a python program to copy the element of a list into the file

n = int(input("Enter the number of elements : "))
l = []
for i in range(1,n+1):
    a = input("Enter the elements:")
    l.append(a)

print("list",l)
f = open("merge.txt","w")
for i in l:
    f.write(i)