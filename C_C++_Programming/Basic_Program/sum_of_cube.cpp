// Calculate sum of cube using for loop

#include<iostream>
using namespace std;

int main()
{
    int num;
    cout << "\n Enter the number : ";
    cin >> num;

    int sum = 0;
    int n = num;
    for ( ; n != 0; n /= 10)
    {
        int a = n % 10;
        sum += (a*a*a);
    }

    cout << "\n Sum of cube of digit is : " << sum;
    
    return 0;  
}