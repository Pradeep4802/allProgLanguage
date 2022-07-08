def powerList(numbers, power):
    print("In the function")
    print(numbers)
    print("Calculating powers")

    result = []
    for x in range(len(numbers)):
        result.append(pow(numbers[x], power))

    numbers = result
    return(numbers)


def main():
    n1 = int(input("Input number1: "))
    n2 = int(input("Input number2: "))
    power = int(input("Input power: "))
    numbers = [x for x in range(n1, n2+1)]
    print(numbers)
    print("Passed to the function powerList")
    print(powerList(numbers, power))


# main()


# Python program to illustrate
# enumerate function in loops
# l1 = ["eat", "sleep", "repeat"]

# printing the tuples in object directly
# for ele in enumerate(l1):
    # print(ele)
# print
# changing index and printing separately
# for count,ele in enumerate(l1, 100):
    # print(count,ele)
