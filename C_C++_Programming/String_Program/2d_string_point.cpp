#include <iostream>
#include <cstring>
using namespace std;

const int FOUND = 1;
const int NOTFOUND = 0;

int main()
{
    char namelist[6][10] = {
        "akshay",
        "parag",
        "samoa",
        "alexander",
        "machos",
        "illeana"};

    char yourname[20];

    cout << "\nEnter the name in the list: ";
    cin >> yourname;

    int i, f, a;
    f = NOTFOUND;

    for (i = 0; i <= 5; i++)
    {
        a = strcmp(&namelist[i][0], yourname);

        if (a == 0)
        {
            cout << "\n Welcome, you can enter the palace.";
            f = FOUND;
            break;
        }
    }

    if (f == NOTFOUND)
    {
        cout << "\nSorry,you are a trespasser.";
    }
    return 0;
}