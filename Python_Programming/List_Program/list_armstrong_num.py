# Write a python program to accept an integer list from user and print all the Armstrong numbers in that list

def Armstrong(arr1):
    sum_list = [None] * len(arr1)
    for i in range(0,len(arr1)):
        n = arr1[i]
        sum = 0
        while(n > 0):
            rem = n % 10
            sum = sum + pow(rem,3)
            n = n // 10
            sum_list[i] = sum
    
    for x in range(0,len(arr1)):
        print("Armstrong of ",arr1[x]," is ",sum_list[x])




num1 = int(input("Enter the number:"))

list1 = []

for i in range(num1):
    ele1 = int(input("Enter the element({})".format(i)))
    list1.append(ele1)

Armstrong(list1)