def reverse(n):
    rev = 0
    while (n > 0):
        remainder = n % 10
        rev = (rev * 10) + remainder
        n = n // 10
    return rev

print("Enter the number : ")
num = int(input())

result = reverse(num)
print("Reverse number is: ",result)

# num_array = list()
# num = raw_input("Enter how many elements you want:")
# print ('Enter numbers in array: ')
# for i in range(int(num)):
#     n = raw_input("num :")
#     num_array.append(int(n))
# print ('ARRAY: ',num_array)

input_string = input('Enter elements of a list separated by space ')
print("\n")
user_list = input_string.split()
# print list
print('list: ', user_list)

# convert each item to int type
for i in range(len(user_list)):
    # convert each item to int type
    user_list[i] = int(user_list[i])

# Calculating the sum of list elements
add = 0
i = 0
while (i < len(user_list)):
    add = add + user_list[i]
    i += 1
print("Add = ",add)
print("Sum = ", sum(user_list))
