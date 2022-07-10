#include <iostream>
#include <cstring>
#include <cstdlib>
using namespace std;

void swap(char **s1, char **s2)
{
    char *t;
    t = *s1;
    *s1 = *s2;
    *s2 = t;
}
int main()
{
    char *names[5];
    char str[20];

    cout << "\n Enter the string in the list: ";
    for (int i = 0; i < 5; i++)
    {
        gets(str);
        names[i] = (char *)malloc(strlen(str));
        strcpy(names[i], str);
    }

    for (int i = 0; i < 5; i++)
    {
        cout << "\n"
             << names[i];
    }

    // char *temp;
    cout << "\nOriginal is " << names[2] << " and " << names[3];

    swap(names[2], names[3]);

    cout << "\n New is " << names[2] << " and " << names[3];
    return 0;
}