class Fact:
    'common base class for all facorial'

    def factorial(self, num):
        i = 1
        f = 1
        while (i <= num):
            f = f * i
            i += 1

        return f

n = int(input("Enter the number : "))
emp1 = Fact()
print("The factorial of number is : ",emp1.factorial(n))

# class CodesCracker:
#     def findFact(self, n):
#         f = 1
#         for i in range(1, n + 1):
#             f = f * i
#         return f


# print("Enter a Number: ", end="")
# num = int(input())

# ob = CodesCracker()
# print("\nFactorial of", num, "=", ob.findFact(num))
