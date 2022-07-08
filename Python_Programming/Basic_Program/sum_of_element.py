# Python program to print the sum of all elements in an array

def sum_element(arr):
    sum = 0
    for i in range(0,len(arr)):
        sum = sum + arr[i]
    return sum


num = int(input("Enter the number:"))

list1 = []

for i in range(num):
    ele = int(input("Enter the element({})".format(i)))
    list1.append(ele)

result = sum_element(list1)

print("Sum of all element in the array are : {}".format(result))


# STEP 1: Declare and initialize an array.
# STEP 2: The variable sum will be used to calculate the sum of the elements. Initialize it to 0.
# STEP 3: Loop through the array and add each element of the array to the variable sum as sum = sum + arr[i].
