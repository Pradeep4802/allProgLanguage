# Write a python code to print sum of cubes of digits of a number

def cube_of_digit(num):
    sum = 0
    x = range(1, num + 1)
    for i in x:
        sum += (i * i * i)
    return sum

print("Enter the number:")
numeric = int(input())

sum1 = cube_of_digit(numeric)

print("Sum of cube of ",numeric," is ",sum1)

# def sumOfSeries(n):
#    x = (n * (n + 1) / 2) ** 2
#    return x
# # main
# n = 3
# print(sumOfSeries(n))
