#include<stdio.h>
// #include<cstdlib>

int main()
{
	int max,i,p[20];
	// printf("Enter the size of the array: ");
	// scanf("%d",&max);

	// p = (int*)malloc(max*sizeof(int));
	for (i = 0; i < 9; ++i)
	{
		p[i] = i * i;
		printf("%d",p[i]);
	}
	return 0;
}