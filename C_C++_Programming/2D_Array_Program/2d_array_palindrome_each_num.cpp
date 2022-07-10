#include <iostream>
using namespace std;

const int r = 3;
const int c = 3;

class palindrome
{
private:
    int arr1[r][c];
    int i, j;
    int f, n;

public:
    void check_rev()
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
        // logic to check whether the each element is prime or not
        for (i = 0; i < r; i++)
        {
            for (j = 0; j < c; j++)
            {
                n = arr1[i][j];
                f = 0;
                while (n > 0)
                {
                    int rem = n % 10;
                    f = (f * 10) + rem;
                    n /= 10;
                }
                if (f == arr1[i][j])
                {
                    cout << arr1[i][j]
                         << " is palindrome number.\n";
                }
            }
        }
    }
};

int main()
{
    palindrome sr;
    sr.check_rev();
    sr.logic();
    return 0;
}