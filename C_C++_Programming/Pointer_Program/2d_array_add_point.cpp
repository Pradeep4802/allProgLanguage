// Write a c++ code to add 2 number at same index number

#include <iostream>
using namespace std;
const int row = 2;
const int col = 2;

void user_input(int *p1);
void show_input(int *p2);
void add_input(int *p1, int *p2, int *p3);

int main()
{
    int arr1[row][col], arr2[row][col], arr3[row][col];
    int result;

    cout << "\n Enter the first array element of " << row
         << "x: "
         << col;
    user_input(arr1[0]);

    cout << "\n Enter the second array element of " << row
         << "x: "
         << col;
    user_input(arr2[0]);

    cout << "\n Display the first array element...";
    show_input(arr1[0]);

    cout << "\n Display the second array element...";
    show_input(arr2[0]);

    add_input(arr1[0], arr2[0], arr3[0]);

    cout << "\nSum of first and second matrix: \n";
    show_input(arr3[0]);
}

void user_input(int *p1)
{
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            cin >> *(p1 + i * col + j);
        }
    }
}

void show_input(int *p2)
{
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            cout << *(p2 + i * col  + j)
                 << "\t";
        }
        cout << "\n";
    }
}

void add_input(int *p1, int *p2, int *p3)
{
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            *(p3 + i * col + j) = *(p1 + i * col + j) + *(p2 + i * col + j);
        }
    }
}


// #include <stdio.h>

// #define ROWS 3
// #define COLS 3


// /* Function declaration to input, add and print matrix */
// void matrixInput(int mat[][COLS]);
// void matrixPrint(int mat[][COLS]);
// void matrixAdd(int mat1[][COLS], int mat2[][COLS], int res[][COLS]);


// int main()
// {
//     int mat1[ROWS][COLS], mat2[ROWS][COLS], res[ROWS][COLS];

//     // Input elements in first matrix
//     printf("Enter elements in first matrix of size %dx%d: \n", ROWS, COLS);
//     matrixInput(mat1);

//     // Input element in second matrix
//     printf("\nEnter elemetns in second matrix of size %dx%d: \n", ROWS, COLS);
//     matrixInput(mat2);

//     // Finc sum of both matrices and print result
//     matrixAdd(mat1, mat2, res);

//     printf("\nSum of first and second matrix: \n");
//     matrixPrint(res);
    

//     return 0;
// }



// /**
//  * Function to read input from user and store in matrix.
//  * 
//  * @mat     Two dimensional integer array to store input.
//  */
// void matrixInput(int mat[][COLS])
// {
//     int i, j;


//     for (i = 0; i < ROWS; i++)
//     {
//         for (j = 0; j < COLS; j++)
//         {
//             // (*(mat + i) + j) is equal to &mat[i][j]
//             scanf("%d", (*(mat + i) + j));
//         }
//     }
// }



// /**
//  * Function to print elements of matrix on console.
//  * 
//  * @mat     Two dimensional integer array to print.
//  */
// void matrixPrint(int mat[][COLS])
// {
//     int i, j;

//     for (i = 0; i < ROWS; i++)
//     {
//         for (j = 0; j < COLS; j++)
//         {
//             // *(*(mat + i) + j) is equal to mat[i][j]
//             printf("%d ", *(*(mat + i) + j));
//         }
//         printf("\n");
//     }
// }



// /**
//  * Function to add two matrices and store their result in given res
//  * matrix.
//  * 
//  * @mat1    First matrix to add.
//  * @mat2    Second matrix to add.
//  * @res     Resultant matrix to store sum of mat1 and mat2.
//  */
// void matrixAdd(int mat1[][COLS], int mat2[][COLS], int res[][COLS])
// {
//     int i, j;


//     // Iterate over each matrix elements 
//     for (i = 0; i < ROWS; i++)
//     {
//         for (j = 0; j < COLS; j++)
//         {
//             // res[i][j] = mat1[i][j] + mat2[i][j]
//             *(*(res + i) + j) = *(*(mat1 + i) + j) + *(*(mat2 + i) + j);
//         }
//     }
// }