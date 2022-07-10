#include <iostream>
using namespace std;

int main()
{
    int arr[20];
    int size;

    // Enter the size of the thar you want to enter.
    cout << "Enter the size of the array: ";
    cin >> size;

    //check whether the size of the user is within the range of the array or not
    if (size >= 20)
        cout << endl
             << "MEMORY OVERFLOW!!!";

    // Read the input from the user
    for (int i = 0; i < size; i++)
    {
        cin >> arr[i];
    }

    // Display the element before the element get inserted
    cout << endl
         << "Element before the element was inserted: ";
    for (int i = 0; i < size; i++)
    {
        cout << endl
             << arr[i];
    }

    int pos;
    // ENter the position where to insert the new value in the array.
    cout << endl
         << "Enter the position where to insert the value: ";
    cin >> pos;

    int val;
    // Enter the value to insert in the array.
    cout << endl
         << "Enter the value : ";
    cin >> val;

    // shift the array from the specified position to the rigth of the array.
    for (int i = size - 1; i >= pos - 1; i--)
    {
        arr[i + 1] = arr[i];
    }
    arr[pos - 1] = val;
    size++;

    //check whether the position is not gone out of the index or not
    if (pos <= 0 || pos > size + 1)
        cout << endl
             << "Invalid Position";

    // Display the all the element after the insertion of the value is happen
    cout << endl
         << "Element after the insertion was the done:";
    for (int i = 0; i < size; i++)
    {
        cout << endl
             << arr[i];
    }

    return 0;
}