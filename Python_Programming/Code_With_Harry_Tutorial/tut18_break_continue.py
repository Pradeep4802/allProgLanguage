# i = 0
#
# while(True):
#     if i+1<5:
#         i = i + 1
#         continue
#     print(i+1, end=" ")
#     if(i==44):
#         break  #stop the loop
#     i = i + 1

while(True):
    user = int(input("Enter the number\n"))
    if user>100:
        print("Congratulation you have entered a number bigger than 100\n.")
        break
    else:
        print("Try again!\n")
        continue