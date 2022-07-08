# Write a python code to print reverse of a number

print("Enter the number:")
dig = int(input())

rev = 0

while dig>0:
    rem = dig % 10
    rev = (rev * 10) + rem
    dig = dig // 10
print("The reverse of",dig," is ",rev)