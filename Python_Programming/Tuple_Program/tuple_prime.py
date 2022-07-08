# Consider the Tuple t=(10,5,12,11,33,100,17,7,13).Write a python
# code to display all the prime numbers from the tuple t.
def isPrime(n):

    for i in range(0, len(n)):
        f = 1
        for j in range(2, n[i]//2):
            if n[i] % j == 0:
                f = 0
                break
        if f == 1:
            print(n[i])

tup1 = (10, 5, 12, 11, 33, 100, 17, 7, 13, 3)

isPrime(tup1)


