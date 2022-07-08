def calc(num1,num2):
    # check which number is greater between them and assign into greater 
    if num1>num2:
        greater = num1
    else:
        greater = num2

    while(True):
        # check at which number both condition is true 
        # If both number is got same then assign into lcm variable
        if ((greater % num1 == 0) and (greater % num2 == 0)):
            lcm = greater
            break
        greater += 1
    
    return lcm



# Taking 2 number input from user
ele1 = int(input("Enter the element: "))
ele2 = int(input("Enter the element: "))


# Displaying the output
print("LCM of 2 number is {}".format(calc(ele1,ele2)))