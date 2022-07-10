// #include <iostream>
// using namespace std;
// const int N = 3;
// struct ArrStruct
// {
//     int arr[N][N];
// };

// void printArray(ArrStruct var)
// {
//     for (int i = 0; i < N; i++)
//     {
//         for (int j = 0; j < N; j++)
//         {
//             cout << var.arr[i][j];
//         }
//         cout << endl;
//     }
// }
// ArrStruct getArray()
// {
//     ArrStruct var;
//     for (int i = 0; i < N; i++)
//     {
//         for (int j = 0; j < N; j++)
//         {
//             var.arr[i][j] = i + j;
//         }
//     }
//     return var;
// }
// int main()
// {
//     ArrStruct arr;
//     arr = getArray();
//     printArray(arr);
//     return 0;
// }

#include <iostream>
using namespace std;
const int N = 3;

//static array
void printArray(int arr[][N])
{
    for (int i = 0; i < N; i++)
    {
        for (int j = 0; j < N; j++)
        {
            cout << arr[i][j];
        }
        cout << endl;
    }
}
typedef int (*doublePointer)[N];
// int (*(getArray)())[N]
doublePointer getArray()
{
    static int arr[N][N] = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
    return arr;
}
int main()
{
    int(*arr)[N] = getArray();
    printArray(arr);
    return 0;
}