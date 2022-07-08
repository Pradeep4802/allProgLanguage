# Write a python code to display the odd and even numbers
# separately from a list. (All elements in the list should be taken
# from user).

def arrange(arr1):
    arr2 = [None] * len(arr1)
    c1 = 0
    for i in range(0, len(arr1)):
        if arr1[i] % 2 == 1:
            c1 += 1

    for i in range(0, len(arr1)):
        for j in range(i+1, len(arr1)):
            if arr1[i] > arr1[j]:
                temp = arr1[i]
                arr1[i] = arr1[j]
                arr1[j] = temp

    k = 0
    j = len(arr1) - c1

    for i in range(0, len(arr1)): 
        if arr1[i] % 2 == 0:
            if k < len(arr1) - c1:
                arr2[k] = arr1[i]
                k += 1
        else:
            if j < len(arr1):
                arr2[j] = arr1[i]
                j += 1

    print("Sorted and arranged even odd list.....")
    for i in range(0, len(arr1)):
        arr1[i] = arr2[i]
        print(arr1[i])


num1 = int(input("Enter the number:"))
list1 = []

for i in range(num1):
    ele1 = int(input("Enter the element({})".format(i)))
    list1.append(ele1)

arrange(list1)
