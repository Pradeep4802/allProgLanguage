#include <iostream>
#include <stdio.h>
using namespace std;

// void display(int *q, int row, int col)
// {
//     int i, j;
//     int *p;
//     for (int i = 0; i < 3; i++)
//     {
//         for (int j = 0; j < 3; j++)
//         {
//             cout << *(q + i * col + j) << "\t";
//         }
//         cout << "\n ";
//     }
//     cout << "\n";
// }

void show(int (*q)[3], int row, int col)
{
    int *p;
    for (int i = 0; i < row; i++)
    {
        p = *(q + i);
        for (int j = 0; j < col; j++)
        {
            printf("%d\t", *(p+j);
        }
        printf("\n");
    }
    printf("\n");
}

// int print(int q[][4], int row, int col)
// {
//     // int *p;
//     for (int i = 0; i < 3; i++)
//     {
//         // q=q+i;
//         for (int j = 0; j < 4; j++)
//         {
//             printf("%d\t", q[i][j]);
//         }
//         printf("\n");
//     }
//     printf("\n");
// }

int main()
{
    int a[3][3]{
        1, 2, 3,
        5, 6, 7,
        9, 0, 1};
    // display(a[0], 3, 4);
    show(a, 3, 3);
    // print(a, 3, 4);
}

// #include<iostream>
// using namespace std;

// int * function () {
//     // int* arr = new int[3];
//     // arr[0] = 1;
//     // arr[1] = 2;
//     // arr[2] = 3;
//     static int arr[3] = {1,2,3};
//     return (&arr[0]);
// }

// int main()
// {
//     int * arr = function();
//     cout << arr[0] << endl;
//     cout << arr[1] << endl;
//     cout << arr[2] << endl;
//     return 0;
// }

// #include<iostream>
// using namespace std;

// int main()
// {
//     int *p;
//     int *fun();
//     p = fun();
//     cout << "\n"
//         << p;
//     cout << "\n"
//         << *p;
// }

// int *fun()
// {
//     static int i = 20;
//     return (&i);
// }
