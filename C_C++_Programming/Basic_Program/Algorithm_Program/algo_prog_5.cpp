// 5. Write a C++ program to create a new string where 'if' is added to the front of a given string. If the string already begins with 'if', return the string unchanged.

#include <iostream>

using namespace std;

string test(string s)
{
    if (s.length() > 2 && s.substr(0, 2) == "if")
    {
        return s;
    }
    return "if " + s;
}

int main()
{
    cout << test("if else") << endl;
    cout << test("else") << endl;
    return 0;
}