#include<stdio.h>

// void display1(int *,int);
void display2(int j[],int);

int main()
{
	int num[3];
	// display1(&num[0],6);
	printf("Enter the element:");
	for (int i = 0; i < 3; ++i)
	{
		scanf("%d",&num[i]);
	}
	for (int i = 0; i < 3; ++i)
	{
		printf("%d",num[i]);
	}

	// display2(num,6);
	return 0;
}

// void display1(int *j,int n)
// {
// 	// int i;
// 	for (int i = 0; i < n - 1; i++)
// 	{
// 		printf("Element = %d\n",*j);
// 		j++;  //increment pointer to point to next element
// 	}
// }

// void display2(int j[],int n)
// {
// 	// int i;
// 	for (int i = 0; i < n; i++)
// 	{
// 		printf("element = %d\n",j[i]);
// 	}
// }