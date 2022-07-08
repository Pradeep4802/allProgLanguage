# Write a program that takes two lists and returns True if they have at least one common member

def member(list1, list2):
    for i in range(0, len(list1)):
        for j in range(0, len(list2)):
            if list1[i] == list2[j]:
                return True
    return False


num1 = int(input("Enter the number:"))
list1 = []
list2 = []

print("Enter the number in the list 1:")
for i in range(0, num1):
    ele1 = int(input("Enter the element({})".format(i)))
    list1.append(ele1)

print("Enter the list in the list2:")
for i in range(0, num1):
    ele2 = int(input("Enter the element({})".format(i)))
    list2.append(ele2)

y = member(list1, list2)

print("{} anyone number is present in both the list".format(y)) if y == True else print(
    "No, Any number is not present in the list")
