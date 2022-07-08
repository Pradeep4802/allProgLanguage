# fo = open("foo.txt", "w")
# fo.write(" python is a great language. \nTeah its great!!\n")

# fo.close()

# Open a file
# fo = open("foo.txt", "r+")
# str = fo.read(10)
# print ("Read String is : ", str)
# Close opened file
# fo.close()

# f = open("abc.txt","r+")
# pos = f.tell()
# print(pos)
# s = f.read(10)
# print(s)
# pos = f.tell()
# print(pos)
# f.seek(0,0)
# print(f.tell())

# print ("read string is : ",s)

# position = f.tell()
# print ("Current file position : ",position)

# position = f.seek(0, 0)
# s = f.read(10)
# print ("Again read string is : ",s)
# f.close()
fo = open("abc.txt", "w")
fo.write( "Python is a great language.\nYeah its great!!\n")


f = open("abc.txt","r")
s = f.read()
f.close()
f = open("xyz.txt","w")
f.write(s)
f.close()
print("File successfully copied")
