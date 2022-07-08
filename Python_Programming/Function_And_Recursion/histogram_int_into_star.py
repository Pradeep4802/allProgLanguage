# Define a function histogram() that takes a list of integers and prints 
# a histogram to the screen. For example, histogram(4, 9, 7) should 
# print the following: 
#  **** 
#  ********* 
#  *******

def histogram(arr):
    for i in range(0,len(arr)):
        len1 = arr[i]
        for j in range(0,len1):
            print(" * ",end = "")
        print("\n")


num1 = int(input("Enter the number:"))
list1 = []

for i in range(num1):
    ele1 = int(input("Enter the element({})".format(i)))
    list1.append(ele1)

histogram(list1)