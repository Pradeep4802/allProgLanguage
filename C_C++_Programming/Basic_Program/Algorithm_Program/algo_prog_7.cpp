// 7. Write a C++ program to exchange the first and last characters in a given string and return the new string.

#include <iostream>
using namespace std;

string str_func_1(string str1)
{
    int i, j;
    int c = 0;
    for (i = 0; str1[i] != '\0'; i++)
    {
        c++;
    }

    for (i = 0, j = c - 1; str1[i] != '\0'; i++, j--)
    {
        char temp = str1[j];
        str1[j] = str1[i];
        str1[i] = temp;
        break;
    }
    // str1[i] = '\0';
    return str1;
}

int main()
{
    string str1;
    cout << "Enter the string: ";
    cin >> str1;

    string str2 = str_func_1(str1);

    cout << endl
         << "String are: " << str2;
    return 0;
}

// #include <iostream>
// using namespace std;

// string test(string str)
//         {
//             return str.length() > 1
//                 ? str.substr(str.length() - 1) + str.substr(1, str.length() - 2) + str.substr(0, 1) : str;
//         }

// int main()
//  {
//   cout << test("abcd") << endl;
//   cout << test("a") << endl;
//   cout << test("xy") << endl;
//   return 0;
// }