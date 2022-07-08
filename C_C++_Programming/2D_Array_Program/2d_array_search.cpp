#include <iostream>
using namespace std;

const int r = 3;
const int c = 3;

class linear
{
private:
    int arr1[r][c];
    int i, j;
    int f = 0;
    int search;

public:
    void linear_search()
    {
        int i, j;
        int f = 0;
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

        cout << "\n"
             << "Enter the element that user want to search: ";
        cin >> search;
    }

    void logic()
    {

        // logic to check the number is present or not in the array
        for (i = 0; i < r; i++)
        {
            for (j = 0; j < c; j++)
            {
                if (arr1[i][j] == search)
                {
                    f = 1;
                    break;
                }
            }
        }
    }
    void display()
    {
        // Display the number is found or not
        if (f == 1)
        {
            cout << "Number is found in the array.";
        }
        else
        {
            cout << "Number is not found in the array.";
        }
    }
};

int main()
{
    linear sr;
    sr.linear_search();
    sr.logic();
    sr.display();
    return 0;
}