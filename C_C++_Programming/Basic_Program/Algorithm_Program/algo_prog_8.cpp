// 8. Write a C++ program to create a new string which is 4 copies of the 2 front characters of a given string. If the given string length is less than 2 return the original string.

#include <iostream>
using namespace std;

string str_func_2(string str2)
{
    int c = 0;
    string str3;

    for (int i = 0; str2[i] != '\0'; i++)
    {
        c++;
    }

    for (int i = 0; str2[i] != '\0'; i++)
    {
        if (c < 2)
        {
            return str2;
        }
        else
        {
            for (int i = 0; i < 4; i++)
            {
                str3 = str3 + str2.substr(0, 2);
            }
            break;
        }
    }
    return str3;
}
int main()
{
    string str1;
    cout << "Enter the string: ";
    cin >> str1;

    string str2 = str_func_2(str1);

    cout << endl
         << "String are: " << str2;
    return 0;
}