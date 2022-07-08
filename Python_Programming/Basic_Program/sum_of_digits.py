# Write a python code to display the sum of cubes of digits of a 
# number using function.

def sum_of_cubes(num2):
    sum = 0
    while( num2 > 0):
        rem = num2 % 10
        sum = sum + pow(rem,3)
        num2 //= 10
    return sum


num1 = int(input("Enter the number:"))

res = sum_of_cubes(num1)

print("{} sum of cubes digit is {}".format(num1,res))