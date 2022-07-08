f=open("merge.txt","r")
s=f.read()
c=input("enter the charcter to be searched: ")
count=0
for i in s:
    if i==c:
        count=count+1

if count==0:
    print("No Such Character Found")
else:
    print("Character",c,"Has Occured",count,"times int file.")
