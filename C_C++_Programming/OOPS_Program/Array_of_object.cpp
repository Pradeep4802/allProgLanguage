#include<iostream>
using namespace std;
const int size = 3;

class employee
{
    char name[30];
    float age;
    public:
    void getdata();
    void setdata();
};

void employee :: getdata() 
{
    cout << "\n Enter the Name: ";
    cin >> name;
    cout << "\n Enter the age: ";
    cin >> age;
}

void employee :: setdata()
{
    cout << "\n Name : " << name;
    cout << "\n Age : " << age;
}

int main()
{
    employee manager[size];
    for(int i = 0; i < size; i++)
    {
        cout << "\n Details of manager: " << i + 1 << "\n";
        manager[i].getdata();
    }
    cout << "\n";
    for(int i = 0 ; i < size; i++)
    {
        cout << "\n Manager: " << i+1;
        manager[i].setdata();
        cout << endl;
    }
    return 0;
}