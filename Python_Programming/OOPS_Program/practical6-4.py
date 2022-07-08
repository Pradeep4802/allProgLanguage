class employee():
    def _init_(self):
        self.getdata()
    def getdata(self):
        self.iD=int(input("Enter Employee id:"))
        self.n=input("Enter Employee name:")
        self.d=input("Enter Employee Designation:")
    def showdata(self):
            print("My name is ",self.n,"and My Id is",self.iD,"and My designation is ",self.d)
class engineer(employee):
    def printdesignation(self):
        self.showdata()
class manager(employee):
    def printdesignation(self):
        self.showdata()
n=int(input("number of sets of Employee:"))
L=list()
for i in range(n):
    e=engineer()
    e.getdata()
    m=manager()
    m.getdata()
    e.printdesignation()
    m.printdesignation()
