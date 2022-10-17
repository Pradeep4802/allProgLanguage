#include <iostream>
using namespace std;

// HOLD
void printArray(int arr[], int size)
{
    cout << endl
         << " printing the array " << endl;
    // print the array
    for (int i = 0; i < size; i++)
    {
        cout << arr[i] << " ";
    }
    cout << "Printing is DONE";
}

int main()
{
    // declare
    int number[15];

    // accesing an array
    cout << "Value at 1 index " << number[14] << endl;

    // cout << "Value at 20 index " << number[20] << endl;

    // initialising an array
    int second[3] = {5, 7, 11};

    // accesing an element
    cout << "Value at 2 index " << second[2] << endl;

    int third[15] = {2, 7};

    int n = 15;

    // print the array
    printArray(third, n);

    // initialising all locations with 0

    int fourth[10] = {0};
    n = 10;
    printArray(fourth, n);

    // initialising all locations with 1 [not possible with below line]
    int fifth[10] = {1};

    n = 10;
    printArray(fifth, n);

    int fifthSize = sizeof(fifth) / sizeof(int);
    cout << endl
         << "Size of Fifth is " << fifthSize << endl;

    char ch[5] = {'a', 'b', 'c', 'r', 'p'};
    cout << ch[3] << endl;

    cout << endl
         << " printing the array " << endl;
    // print the array
    for (int i = 0; i < 5; i++)
    {
        cout << ch[i] << " ";
    }
    cout << endl
         << "Printing is DONE";

    double firstDouble[5];
    float firstFloat[6];
    bool firstBool[9];

    cout << " Everything is fine ";
    return 0;
}