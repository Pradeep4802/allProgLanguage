#include <iostream>
// #include <ostream>
// using namespace std;

struct Emp
{
    int eno;
    char ename[20];
    float sal;
};
int main()
{
    struct Emp *ptr;
    ptr = (struct Emp *)malloc(sizeof(struct Emp));

    if (ptr == NULL)
    {
        std::cout << "out of memory";
    }
    else
    {
        std::cout << "\n Enter Emp Details : ";
        std::cin >> ptr->eno >> ptr->ename >> ptr->sal;
    }

    std::cout << "\n"
         << "Employee Number: "
         << ptr->eno
         << "\n"
         << "Employee name: "
         << ptr->ename
         << "\n"
         << "Employee Salary: "
         << ptr->sal;
    return 0;
}