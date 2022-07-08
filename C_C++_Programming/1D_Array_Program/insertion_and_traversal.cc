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

int insertion(int a[], int element, int size, int capacity, int index)
{
    // code for insertion
    if (size >= capacity)
        return -1;

    for (int i = size - 1; i >= index; i--)
    {
        a[i + 1] = a[i];
    }
    a[index] = element;

    return true;
}

int main()
{
    int a[100] = {7, 8, 12, 27, 88};
    int size = 5, element = 45, index = 5;
    int val;
    cout << "\n"
         << "Display the number without insertion...";
    display(a, size);
    cout << "\n"
         << "Display the number with insertion...";
    val = insertion(a, element, size, 100, index);
    size += 1;
    display(a, size);

    if (val == true)
        cout << "\n"
             << "Insertion is done";
    else
        cout << "\n"
             << "Insertion failed";
    return 0;
}