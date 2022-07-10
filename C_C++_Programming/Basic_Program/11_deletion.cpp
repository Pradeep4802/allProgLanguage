#include <iostream>
using namespace std;

void display(int a[], int size)
{
    // code for traversal
    for (int i = 0; i < size; i++)
    {
        cout << " "
             << a[i];
    }
}

void deletion(int a[], int size, int capacity, int index)
{
    for (int i = index - 1; i < size - 1; i++)
    {
        a[i] = a[i+1];
    }
}

int main()
{
    int a[100] = {7, 8, 12, 27, 88};
    int size = 5;
    int index = 2;
    cout << "\n"
         << "Display the number without deletion...";
    display(a, size);
    cout << "\n"
         << "Display the number with deletion...";
    deletion(a, size, 100, index);
    size -= 1;
    display(a, size);

    // if (val == true)
    //     cout << "\n"
    //          << "Insertion is done";
    // else
    //     cout << "\n"
    //          << "Insertion failed";
    return 0;
}