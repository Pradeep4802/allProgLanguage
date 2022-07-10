#include <iostream>
using namespace std;

int main()
{
    int age;
    char sex;
    char Marital;

    cout << "\n Enter the age: ";
    cin >> age;

    cout << "\n Enter the Sex: ";
    cin >> sex; //Enter M or F

    cout << "\n ENter the Marital: ";
    cin >> Marital; // ENter Y or N

    if (sex == 'F')
    {
        cout << "\nFemale can work only in Urban Areas";
    }
    else
    {
        if (age > 20 && age <= 40)
        {
            cout << "\n Male may work anywhere";
        }
        else if (age > 40 && age <= 60)
        {
            cout << "\n Male can work in Urban Areas only";
        }
        else
        {
            cout << "\nERROR";
        }
    }
    return 0;
}