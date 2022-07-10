#include <iostream>
using namespace std;
const int row = 3;
const int col = 4;
int *fun1();
int (*fun2())[col];
int main()
{
    int i, j;
    int *a;
    int *fun1();

    int(*b)[col];
    int(*fun2())[col];
    int *p;

    int(*c)[row][col];
    int(*fun3())[row][col];

    // a = fun1();
    // cout << "\n Array a[][] in main():\n";
    // for (int i = 0; i < row; i++)
    // {
    //     for (int j = 0; j < col; j++)
    //     {
    //         cout << "\t"
    //              << *(a + i * col + j);
    //     }
    //     cout << "\n";
    // }

    // b = fun2();
    // cout << "\n Array b[][] in main():\n";
    // for (int i = 0; i < row; i++)
    // {
    //     // p = *(b + i);
    //     for (int j = 0; j < col; j++)
    //     {
    //         cout << "\t"
    //              << *(p+j);
    //         // p++;
    //     }
    //     cout << "\n";
    // }

    c = fun3();
    cout << "\n Array c[][] in main():\n";
    for (int i = 0; i < row; i++)
    {
        // p = *(b + i);
        for (int j = 0; j < col; j++)
        {
            cout << "\t"
                 << (*c)[i][j];
            // p++;
        }
        cout << "\n";
    }
}

// int *fun1()
// {
//     static int a[row][col] = {
//         1, 2, 3, 4,
//         5, 6, 7, 8,
//         9, 0, 1, 6};
//     int i, j;
//     cout << "Array a[][] in fun1():\n";
//     for (int i = 0; i < row; i++)
//     {
//         for (int j = 0; j < col; j++)
//         {
//             cout << "\t"
//                  << a[i][j];
//         }
//         cout << "\n";
//     }
//     return (int*)a;
// }

// int (*fun2())[col]
// {
//     static int b[row][col] = {
//         9, 4, 6, 4,
//         1, 3, 2, 1,
//         7, 5, 1, 6};
//     int i, j;
//     cout << "Array a[][] in fun1():\n";
//     for (int i = 0; i < row; i++)
//     {
//         for (int j = 0; j < col; j++)
//         {
//             cout << "\t"
//                  << b[i][j];
//         }
//         cout << "\n";
//     }
//     return b;
// }

int (*fun3())[row][col]
{
    static int c[row][col] = {
        9, 4, 6, 4,
        1, 3, 2, 1,
        7, 5, 1, 6};
    int i, j;
    cout << "Array a[][] in fun1():\n";
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            cout << "\t"
                 << c[i][j];
        }
        cout << "\n";
    }
    return (int(*)[row][col])c;
}