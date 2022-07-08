# book = {"Name":"Python","Price":250,"Author":"Peter","Edition": 5}
# print(book)
# print(book["Name"])

# sqrt = {2:4,10:100,7:49,5:25}
# print(sqrt[5])


# personal = {"Name": "Pradeepkumar Pal", "Class": "Bsc.IT", "Phone": 7045757937,"Hobbies": "Cricket"}
# print(personal["Phone"])

# book1 = {"Name":"C++", "Price":250, "Author":"Kanetkar"}
# book1["Price"] = 300
# del book1["Author"]
# book1.clear()
# del book1
# print(book1)

# square = {2:4,3:9,4:16}
# print(len((square)))

# square = {2:4,3:9,4:16}
# print(str(square))

# square = {2:4,3:9,4:16}
# print(square)



n = int(input("Enter how many elements you want in dictionary"))
sqr = {}

for i in range(1,n+1):
    x = int(input("Enter the key value"))
    sqr[x] = x*x



print(sqr)

