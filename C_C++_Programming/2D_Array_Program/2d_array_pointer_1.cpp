// #include<iostream>
// using namespace std;

// int main()
// {
//     int a[3][4] = {
//         5,7,5,9,
//         4,6,3,1,
//         2,9,0,6
//     };

//     int *p;
//     int(*q)[4];

//     p = *a;
//     q = a;

//     printf( "\n%u %u",p,q);
//     p++;
//     q++;
//     printf("\n%u %u",p,q);
//     return 0;
// }

#include <stdio.h>
// A normal function with an int parameter
// and void return type
void fun(float a)
{
	printf("Value of a is %f\n", a);
}

int main()
{
	// fun_ptr is a pointer to function fun()
	void (*fun_ptr)(float) = fun;

	/* The above line is equivalent of following two
	void (*fun_ptr)(int);
	fun_ptr = &fun;
	*/

	// Invoking fun() using fun_ptr
	(fun_ptr)(10);

	return 0;
}
