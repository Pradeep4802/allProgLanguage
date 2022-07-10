#include<iostream>
using namespace std;

int main()
{
    int marks[] = {23, 45, 56, 89};
    int mathMarks[4];
    mathMarks[0] = 2278;
    mathMarks[1] = 737;
    mathMarks[2] = 28;
    mathMarks[3] = 23322;
    // cout << "These are math marks" << endl;
    // cout << &mathMarks[0] << endl;
    // cout << &mathMarks[1] << endl;
    // cout << &mathMarks[2] << endl;
    // cout << &mathMarks[3] << endl;
    // cout << marks[0] << endl;
    // cout << marks[1] << endl; 
    // cout << marks[2] << endl;
    // cout << marks[3] << endl;

    // Pointers and arrays 
    int *p;
    p = marks;
    cout << *(p++)<<endl;
    cout << *(++p);
    // cout << "The value of marks[0] is " << *p << endl;
    // cout << "The value of marks[0] is " << *(p+1) << endl;
    // cout << "The value of marks[0] is " << *(p+2) << endl;
    // cout << "The value of marks[0] is " << *(p+3) << endl;
    // cout << "The value of marks[0] is " << *(p+4) << endl;
    return 0;  
}