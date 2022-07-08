#include<iostream>
using namespace std;

string str_func(string str , int n)
{
    int i;
    for (i = 0; str[i] != '\0'; i++)
    {
        if (i >= n)
        {
            str[i] = str[i+1];
        }
    }
    str[i] = '\0';
    return str;
}

int main()
{
    string str;

    cout <<"Enter the string: ";
    cin >> str;

    int n;
    cout <<endl<<"Enter the index number: ";
    cin >> n;

    string str1 = str_func(str, n);
    cout <<endl << "String are: " << str1;
    return 0;
}