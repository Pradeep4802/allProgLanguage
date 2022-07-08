# Write a python code to print the sum of natural numbers using 
# recursive functions

def recur_sum(num2):
    if num2 <= 1:
        return num2
    else:
        return num2 + recur_sum(num2-1)


num1 = int(input("Enter the number:"))

add = recur_sum(num1)
print("Sum of natural number is {}".format(add))