# Python program to print the elements of an array present on odd position

def odd_index(arr):
    for i in range(0, len(arr), 2):    
        print(arr[i]); 

num = int(input("Enter the number: "))

list1 = []

for i in range(num):
    ele = int(input("Enter the element({}):".format(i)))
    list1.append(ele)    

odd_index(list1)






# STEP 1: Declare and initialize an array.
# STEP 2: Calculate the length of the declared array.
# STEP 3: Loop through the array by initializing the value of variable "i" to 0 then incrementing its value by 2, i.e., i=i+2.
# STEP 4: Print the elements present in odd positions.