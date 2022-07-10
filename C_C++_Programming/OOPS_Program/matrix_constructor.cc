#include <iostream>
using namespace std;

class matrix
{
    int **p;
    int d1, d2;

public:
    matrix(int x, int y);
    void get_Input(int x, int y, int value);
    int &put_input(int i, int j)
    {
        return p[i][j];
    }
};

matrix ::matrix(int x, int y)
{
    d1 = x;
    d2 = y;
    p = new int *[d1]; // creates an array pointer
    for (int i = 0; i < d1; i++)
        p[i] = new int[d2]; // create space for each row
}

void matrix ::get_Input(int x, int y, int value)
{
    p[x][y] = value;
}

main()
{
    int m, n;
    cout << "Enter the size of the matrix: ";
    cin >> m >> n;
    matrix A(m, n);
    cout << "\n Enter the matrix in the row and column : \n";
    int i, j, value;
    for (i = 0; i < m; i++)
    {
        for (j = 0; j < n; j++)
        {
            cin >> value;
            A.get_Input(i, j, value);
        }
    }
    cout << endl;
    cout << A.put_input(1, 2);
    return 0;
}