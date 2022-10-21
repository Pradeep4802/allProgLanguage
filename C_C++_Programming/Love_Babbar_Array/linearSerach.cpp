#include <iostream>
using namespace std;

bool search(int arr[], int size, int key)
{
    for (int i = 0; i < size; i++)
    {
        if (arr[i] == key)
        {
            return 1;
        }
    }
    return 0;
}

// revursive approach to linear search
int linearsearch(int arr[], int size, int key)
{
    if (size == 0)
    {
        return -1;
    }
    else if (arr[size - 1] == key)
    {
        // Return the index of found key.
        return size - 1;
    }
    else
    {
        int ans = linearsearch(arr, size - 1, key);
        return ans;
    }
}

int main()
{
    int arr[] = {5, 15, 6, 9, 4 };

    // Whether 1 is present in the or not ?
    cout << "Enter the element to search for " << endl;
    int key;
    cin >> key;

    bool found1 = search(arr, 10, key);
    int found2 = linearsearch(arr, 10, key);

    if (found1)
    {
        cout << " Key is present " << endl;
    }
    else
    {
        cout << " Key is absent " << endl;
    }

    cout << "Index found at " << found2 << endl;

    return 0;
}