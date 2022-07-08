class employee:
    def _init_(self):
        self.getInfo()
        
    def getInfo(self):
        self.n=input("Enter Empolyee Name:")
        self.i=int(input("Enter Employee ID:"))
        self.s=int(input("Enter Employee Salary:"))

    def displayInfo(self):
        print("Employee Name:",self.n)
        print("Employee ID:", self.i)
        print("Employee Salary:",self.s)
        
n=int(input("Enter the Number of Employee:"))
L=list()

for i in range(n):
    obj=employee()
    obj.getInfo()
    obj.displayInfo()
