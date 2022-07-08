def natural(n):
    sum = 0
    
    for i in range(0,len(n)):
        sum = sum + n[i]
    return sum   


# Take how many element that user want to enter in the list
num = int(input("Enter the number: "))

# Make a empty list
list1 = []

# input the element in the list
for i in range(0,num):
    ele = int(input("Enter he input at {}: ".format(i)))
    list1.insert(i, ele)

print("Sum of Natural Number : ",natural(list1))

# ------------------------OR-----------------------------

num = int(input("Enter a number: "))  
  
if num < 0:  
   print("Enter a positive number")  
else:  
   sum = 0  
   # use while loop to iterate un till zero  
   while(num > 0):  
       sum += num  
       num -= 1  
   print("The sum is",sum)  