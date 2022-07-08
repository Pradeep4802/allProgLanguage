# Write a Python script to sort (ascending and descending) a
# dictionary by value


# def dict_fact(x):
#     a = 1
#     for i in range(1, x+1):
#         # i = int(input("Enter the number to find a factorial: "))
#         a = a * i
#     return a

# num = int(input("Enter the element in the dictionary:"))

# fact = {}


# for i in range(1,num+1):
#     k = int(input("Enter the element: "))
#     fact[k] = dict_fact(k)

# print(fact)


def dict_prime(n):
    for i in range(n):
        f = 1
        for j in range(2, n):
            if n != j:
                if n % j == 0:
                    f = 0
    return f

    # print(prime)


num = int(input("Enter the number:"))

prime = {}

for i in range(1, num+1):
    ele = int(input("Enter the element as a key:"))
    prime[ele] = dict_prime(ele)
    if prime[ele] == 1:
        prime[ele] = "prime"
    else:
        prime[ele] = "not prime"


print(prime)
