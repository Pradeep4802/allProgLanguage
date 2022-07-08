# A pangram is a sentence that contains all the letters of the English 
# alphabet at least once, for example: The quick brown fox jumps 
# over the lazy dog. Your task here is to write a function to check a 
# sentence to see if it is a pangram or not.

def pangram(wor):
    str2 = wor.lower()
    alp = "abcdefghijklmnopqrstuvwxyz"
    for i in alp:
        if i not in str2:
            return False
    return True

str1 = input("Enter the sentence: ")
print(str1)
str3 = pangram(str1)
if str3 == True:
    print("'{}'  is a pangram.".format(str1))
else:
    print(" '{}' is not a pangram".format(str1))
