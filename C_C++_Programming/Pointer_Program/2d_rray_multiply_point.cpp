#include <iostream>
using namespace std;

const int row = 2;
const int col = 2;

void user_input(int *p1);
void show_input(int *p2);
void logic_input(int *p1, int *p2, int *p3);

int main()
{
    int arr1[row][col], arr2[row][col], arr3[row][col];
    // int *p = arr3[row][col];

    cout << "\n Enter the 1st Array element: \n";
    user_input(arr1[0]);

    cout << "\n Enter the 2nd array element: \n";
    user_input(arr2[0]);

    cout << "Display the 1st array element : \n";
    show_input(arr1[0]);

    cout << " Display the 2nd array element : \n";
    show_input(arr2[0]);

    logic_input(arr1[0], arr2[0], arr3[0]);

    cout << "\n"
         << "Multiply the 2 matrix are.....\n";
    show_input(arr3[0]);
    return 0;
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
            cout << *(p2 + i * col + j)
                 << "\t";
        }
        cout << "\n";
    }
}

void logic_input(int *p1, int *p2, int *p3)
{
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            *(p3 + i * col + j) = 0;
            for (int k = 0; k < col; k++)
            {
                *(p3 + i * col + j) = *(p3 + i * col + j) + *(p1 + i * col + k) * *(p2 + k * col + j);
            }
        }
    }
}

//  * C program to multiply two matrix using pointers
//  */

// #include <stdio.h>

// #define ROW 3
// #define COL 3

/* Function declarations */
// void matrixInput(int mat[][COL]);
// void matrixPrint(int mat[][COL]);
// void matrixMultiply(int mat1[][COL], int mat2[][COL], int res[][COL]);

// int main()
// {
//     int mat1[ROW][COL];
//     int mat2[ROW][COL];
//     int product[ROW][COL];

/*
     * Input elements in matrices.
     */
// printf("Enter elements in first matrix of size %dx%d\n", ROW, COL);
// matrixInput(mat1);

// printf("Enter elements in second matrix of size %dx%d\n", ROW, COL);
// matrixInput(mat2);

// // Call function to multiply both matrices
// matrixMultiply(mat1, mat2, product);

// // Prin"Product of both matrices is : \n");
// matrixt product of both matrix
// printf(Print(product);

// return 0;
// }

/**
 * Function to input elements in matrix from user.
 *
 * @mat     Two-dimensional array to store user input.
 */
// void matrixInput(int mat[][COL])
// {
//     int row, col;

//     for (row = 0; row < ROW; row++)
//     {
//         for (col = 0; col < COL; col++)
//         {
//             scanf("%d", (*(mat + row) + col));
//         }
//     }
// }

/**
 * Function to print elements in a two-dimensional array.
 *
 * @mat     Two-dimensional array to print.
//  */
//                 void matrixPrint(int mat[][COL])
//                 {
//                     int row, col;

//                     for (row = 0; row < ROW; row++)
//                     {
//                         for (col = 0; col < COL; col++)
//                         {
//                             printf("%d ", *(*(mat + row) + col));
//                         }

//                         printf("\n");
//                     }
//                 }

/**
 * Function to multiply two matrices.
 *
 * @mat1    First matrix
 * @mat2    Second matrix
 * @res     Resultant matrix to store product of both matrices.
 */
// void matrixMultiply(int mat1[][COL], int mat2[][COL], int res[][COL])
// {
//     int row, col, i;
//     int sum;

//     for (row = 0; row < ROW; row++)
//     {
//         for (col = 0; col < COL; col++)
//         {
//             sum = 0;

/*
             * Find sum of product of each elements of 
             * rows of first matrix and columns of second 
             * matrix.
             */
// for (i = 0; i < COL; i++)
// {
//     sum += (*(*(mat1 + row) + i)) * (*(*(mat2 + i) + col));
// }

/* 
             * Store sum of product of row of first matrix 
             * and column of second matrix to resultant matrix.
             */
//                             *(*(res + row) + col) = sum;
//                         }
//                     }