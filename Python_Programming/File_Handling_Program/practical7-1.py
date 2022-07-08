import area

n=int(input("enter radius for circle :"))
Area.area_circle(n)


b=int(input("enter base for triangle :"))
h=int(input("enter height for traingle :"))
Area.area_triangle(h,b)


l=int(input("enter length of rectangle :"))
b=int(input("enter breadth of rectangle :"))
Area.area_rect(l,b)

pi = 3.14
def area_circle(r):
    a = pi*r*r
    print("Area of circle = ",a)

def area_circle(r):
    a = 0.5*b*h
    print("Area of Triangles = ",a)

def area_circle(r):
    a = l * b
    print("Area of rectangle = ",a)