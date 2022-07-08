# Write a program to generate a fibonacci series

n_term = int(input("Enter the terms : "))

n1, n2 = 0, 1
count = 0

# check if the number of the term is valid or not
if n_term < 0:
    print("Enter only positive terms.")

# if the number of term are 1 then return n1
elif n_term == 1:
    print("Fibonacci sequence upto ", n_term, ":", n1)

else:
    print("Fibonacci series are....")
    while (count < n_term):
        print(n1)
        nth = n1 + n2

        # update the value
        n1 = n2
        n2 = nth
        count += 1
