#include <iostream>
#include <climits>
#include <vector>
using namespace std;
// void revPrint(int arr[]. int index);

void print(int arr[], int len, int index)
{
    // base
    if (index == len)
    {
        return;
    }
    // ek case solve
    print(arr, len, index + 1);
    cout << arr[index] << ", ";
    // index-=1;

    // Recursive call
}

void revPrint(int arr[], int index)
{
    // base case
    if (index < 0)
    {
        return;
    }
    cout << arr[index] << ", ";

    // R,R
    revPrint(arr, index - 1);
}

void print3(int arr[], int size)
{
    // base case
    if (size == 0)
    {
        return;
    }

    cout << arr[0] << ", ";

    // R.C
    print3(arr + 1, size - 1);
}

int getMax(int arr[], int size, int index)
{
    // base case
    if (index == size)
        return INT_MIN;

    int ans = arr[index];
    int recAns = getMax(arr, size, index + 1);
    return max(ans, recAns);
}

void getMaxElement(int arr[], int size, int index, int &maxi)
{
    // base case
    if (index == size)
        return;

    maxi = max(maxi, arr[index]);

    /// RR
    getMaxElement(arr, size, index + 1, maxi);
}

int firstOccurence(int arr[], int size, int index, int target)
{
    // base case
    if (index == size)
        return -1;

    int res = arr[index];

    if (target == res)
    {
        return index;
    }
    firstOccurence(arr, size, index + 1, target);
}

int lastOccurence(int arr[], int size, int index, int target)
{
    static int last;
    // base case
    if (index == size + 1)
        return last;
    // return -1;

    if (arr[index] == target)
    {
        last = index;
    }
    lastOccurence(arr, size, index + 1, target);
}

int allOccurence(int arr[], int size, int index, int target, vector<int> &ans)
{
    // base case
    if (index == size)
        return -1;

    if (arr[index] == target)
        ans.push_back(index);

    allOccurence(arr, size, index + 1, target, ans);
}

int main()
{
    // int arr[] = {1, 3, 5, 7, 4, 6};
    // int arr[] = {7, 2, 15, 9, 21, 18};
    int arr[] = {1, 3, 2, 3, 6, 4, 3, 4, 6, 6, 3, 5, 8, 9};
    // int len = sizeof(arr) / sizeof(arr[0]);
    int len = 14;
    int target = 3;

    vector<int> ans;
    allOccurence(arr, len, 0, target, ans);

    cout << "Printing the ans array" << endl;
    for (int i = 0; i < ans.size(); i++)
    {
        cout << ans[i] << ", ";
    }

    // cout << getMax(arr, len, 0);
    // int maxi = INT16_MIN;
    // getMaxElement(arr, len, 0, maxi);
    // cout << maxi << endl;
    // print3(arr,len);
    // revPrint(arr, len-1);
    // print(arr, len, 0);

    // cout << firstOccurence(arr,len,0,21);
    // cout << lastOccurence(arr, len, 0, 3);
    cout << endl;
    return 0;
}
