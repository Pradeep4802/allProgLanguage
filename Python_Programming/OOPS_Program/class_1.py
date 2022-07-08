class Employee:
    'common base class for all employees'
    empcount = 0

    def __init__(self, name, salary):
        self.name = name
        self.salary = salary
        Employee.empcount += 1

    def displaycount(self):
        print("Total Employee ", Employee.enmpcount)

    def displayEmployee(self):
        print("Name : ", self.name, "salary: ", self.salary)

emp1 = Employee("Zara", 2000)
emp2 = Employee("Manni", 5000)
emp1.displayEmployee()
emp2.displayEmployee()
print ("Total Employee %d" ,Employee.empCount)