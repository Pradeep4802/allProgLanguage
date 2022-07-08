/*
Q.1 Write a program to generate the adjacency matrix.
*/
#include <iostream>
using namespace std;

int main()
{
    int ad[10][10], i, j, m, n, a, b;
    cout << "Enter no. of nodes: ";
    cin >> n;

    for (i = 0; i < n; i++)
        for (j = 0; j < n; j++)
            ad[i][j] = 0;
    cout << "\nEnter number of edges: ";
    cin >> m;
    for (i = 0; i < m; i++)
    {
        cout << "\nEnter edge between: ";
        cin >> a >> b;
        ad[a][b] = 1;
    }

    //	Adjacency Matrix display cout<<"\nAdjacency Matrix\n"; for(i=0;i<n;i++)

    {
        for (j = 0; j < n; j++)
            cout << ad[i][j] << " ";
        cout << "\n";
    }
}