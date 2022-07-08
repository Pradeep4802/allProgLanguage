# Write a recursive function to print the factorial for a given number

def factorial(num):
    if num == 1:
        return num
    else:
       return num * factorial(num - 1)
    

num = int(input("Enter the number:"))

result = factorial(num)

print("factorial of {} is {}".format(num, result))

