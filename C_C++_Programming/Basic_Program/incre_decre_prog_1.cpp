#include<iostream>
#include<stdio.h>
#include<string.h>
using namespace std;

int main()
{
    char* str = "learnown";
    printf("%c\n",*str+++3);
    printf("%s",++str+2);
    return 0;
}