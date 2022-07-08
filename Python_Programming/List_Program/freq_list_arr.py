def frequency(arr):
    arr2 = [None]*len(arr)
    visited = -1

    for i in range(0, len(arr)):
        count = 1
        for j in range(i+1, len(arr)):
            if (arr[i] == arr[j]):
                count += 1
                arr2[j] = visited

        if (arr2[i] != visited):
            arr2[i] = count
    return arr2


num1 = int(input("Enter the number: "))
list1 = []


for i in range(0, num1):
    ele1 = int(input("Enter the element: "))
    list1.append(ele1)
visited = -1
arr2 = frequency(list1)
print("Numbers | frequency")
for i in range(0, len(arr2)):
    if (arr2[i] != visited):
        print("  " + str(list1[i]) + "  |  ", str(arr2[i]))


# # Initialize array
# arr = [1, 2, 8, 3, 2, 2, 2, 5, 1]
# # Array fr will store frequencies of element
# fr = [None] * len(arr)
# visited = -1

# for i in range(0, len(arr)):
#     count = 1
#     for j in range(i+1, len(arr)):
#         if(arr[i] == arr[j]):
#             count = count + 1
#             # To avoid counting same element again
#             fr[j] = visited

#     if(fr[i] != visited):
#         fr[i] = count

# #  Displays the frequency of each element present in array
# print("---------------------")
# print(" Element | Frequency")
# print("---------------------")
# for i in range(0, len(fr)):
#     if(fr[i] != visited):
#         print("    " + str(arr[i]) + "    |    " + str(fr[i]))
# print("---------------------")
