# Write a python code to print 10 natural number
list1 = []

n = int(input("Enter number of elements : "))
for i in range(0, n):
    ele = int(input())
    list1.append(ele)
 
print("User's input are...")
for i in range(0, n):
    print(list1[i])