def final(D):
    sum = 0
    for i in D:
        sum = sum + D[i]
    return sum

dict = {'a': 978, 'b':344, 'c':312}
print("Sum :", final(dict))
