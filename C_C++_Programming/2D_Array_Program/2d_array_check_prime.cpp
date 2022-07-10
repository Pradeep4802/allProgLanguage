#include <iostream>
using namespace std;

const int r = 3;
const int c = 3;

class linear
{
private:
    int arr1[r][c];
    int i, j;
    int f, n;

public:
    void check_prime()
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
    }

    void logic()
    {

        // logic to check whether the each element is prime or not
        for (i = 0; i < r; i++)
        {
            for (j = 0; j < c; j++)
            {
                n = arr1[i][j];
                f = 0;
                if (n != 1)
                {
                    for (int k = 2; k < n; k++)
                    {
                        if (n % k == 0)
                        {
                            f = 1;
                            break;
                        }
                    }
                    if (f == 0)
                    {
                        cout << n
                             << " is prime number"
                             <<"\n";
                    }
                }
            }
        }
    }
};

int main()
{
    linear sr;
    sr.check_prime();
    sr.logic();
    return 0;
}