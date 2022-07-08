#include <iostream>
using namespace std;

const int r = 3;
const int c = 3;

class factorial
{
private:
    int arr1[r][c];
    int i, j;
    int sum, n;

public:
    void fact()
    {
        int i, j;
        // Taking input from user
        cout << "Enter the element: ";
        for (i = 0; i < r; i++)
        {
            for (j = 0; j < c; j++)
            {
                cin >> arr1[i][j];
            }
        }

        // Displaying the read of array
        cout << "\n Displaying the read input:..\n";
        for (i = 0; i < r; i++)
        {
            for (j = 0; j < c; j++)
            {
                cout << " \t "
                     << arr1[i][j];
            }
            cout << "\n";
        }
        cout << "\n\n";
    }

    void logic()
    {
        // logic to calculate each element fatorial
        for (i = 0; i < r; i++)
        {
            for (j = 0; j < c; j++)
            {
                n = arr1[i][j];
                sum = 1;

                if (n == 0)
                {
                    cout << "\t 0 ";
                }

                else if (n == 1)
                {
                    cout << "\t 1 ";
                }

                else
                {
                    while (n >= 1)
                    {
                        sum = sum * n;
                        n = n - 1;
                    }

                    cout << " \t "
                         << sum;
                }
            }
            cout<<"\n";
        }
    }
};

int main()
{
    factorial sr;
    sr.fact();
    sr.logic();
    return 0;
}