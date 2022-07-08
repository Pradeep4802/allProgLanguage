class student:
    name=None
    roll=None
    Class=None
    def getinfo(self,roll,name,Class):
        self.__roll=roll
        self.__name=name
        self.__Class=Class
    def displayinfo(self):
        print("student name :",self.__name)
        print("student rollno :",self.__roll)
        print("student Class :",self.__Class)

s=student()
n=int(input("enter the number of student :"))
L=list()
for i in range(n):
    s.getinfo(
        name=input("name :")
        ,roll=int(input("Rollno :"))
        ,Class=input("Class :"))

    s.displayinfo()
