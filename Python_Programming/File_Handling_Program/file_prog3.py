f = open("merge.txt", "r")
s = f.read()
c = input("Enter the character to be searched :")
count = 0
for i in s:
    if i == c:
        count = count + 1

if count == 0:
    print("No such character found")
else:
    print("Character ", c, " has ocurred ", count, " times in the file ")
