# Python program to right rotate the elements of an array

def right_rotate(arr,n):
    print("Original Array are.....")
    for i in range(0,len(arr)):
        print(arr[i])

    # Declaring for loop to the position where i is the position 
    for i in range(0,n):
        l1 = len(arr) - 1
        last = arr[l1]
        for j in range(len(arr)-1,-1,-1):
            arr[j] = arr[j-1]
        arr[0] = last 

    return arr

num1 = int(input("Enter the number: "))
pos = int(input("Enter the position from which you want rotate an list:"))
list1 = []

for i in range(0, num1):
    ele1 = int(input("Enter the element: "))
    list1.append(ele1)

num = right_rotate(list1, pos)

print("After right rotation")
for i in range(0, len(num)):
    print(num[i])
