#include <iostream>
using namespace std;

const int r = 3;
const int c = 3;

class linear
{
private:
    int arr1[r][c];
    int i, j;
    int count = 0;
    int num;

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
             << "Enter the element that you want to count: ";
        cin >> num;
    }

    void logic()
    {

        // logic to check the number is present or not in the array
        for (i = 0; i < r; i++)
        {
            for (j = 0; j < c; j++)
            {
                if (arr1[i][j] == num)
                {
                    count++;
                }
            }
        }
    }
    void display()
    {
        cout << num
             << " is present "
             << count
             <<" times";
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