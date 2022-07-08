#include <stdio.h>
void change(int *);
int main()
{
	// int *p[4];
	// int (*q)[4];

	// printf("%d\nh",sizeof(p));
	// printf("%d",sizeof(q));

	// int a[] = {10,20,30,40,50};
	// int j;
	// for (int i = 0; i < 5; ++i)
	// {
	// 	printf("\n%d",*a);

	// }

	// float a[] = {13.24,1.5,1.5,5.4,3.5};
	// float *j,*k;
	// j = a;
	// k = a + 4;
	// // j = j*2;
	// // k = k/2;
	// printf("\n%.2f %.2f",*j,*k);

	// int n[25];
	// n[0] = 100;
	// n[24] = 200;
	// printf("\n%d %d",*n,*(n+24) + *(n+0));

	// int b[] = {10,20,30,40,50};
	// int i,*k;
	// k = &b[4] - 4;
	// for (i = 0; i < 5; ++i)
	// {
	// 	printf(" %d",*k);
	// 	k++;
	// }

	// char a[] = "Visual C++";
	// char *b = "Visual C++";
	// printf("\n%d %d",sizeof(a),sizeof(b));
	// printf("\n%d %d",sizeof(*a),sizeof(*b));

	// Question No 7
	// int arr[] = {12,14,15,23,45};
	// printf("%u %u",arr,&arr);
	// printf("\n %u %u",arr+1,&arr+1);

	// Question No: 9
	// int a[3][4] = {
	// 	1,2,3,4,
	// 	5,6,7,8,
	// 	9,10,11,12
	// };
	// printf("\n%u %u %u",*a+1,*(a[0]+1),*(*(a+0)+1));
	// printf("\n%u %u",a,a[0]);

	// Question No: 11
	// int arr[2][3][4] = {
	// 		{
	// 			1,2,3,4,
	// 			5,6,4,3,
	// 			9,7,2,1
	// 		},
	// 		{
	// 			4,3,8,6,
	// 			5,0,1,2,
	// 			4,7,3,1
	// 		}
	// 	};

	// printf("\n%u %u %u %u",arr,*arr,**arr,***arr);

	// Question No: 14
	// int a[5] = {2, 3, 4, 5, 6};
	// int i;

	// change(a);
	// for (i = 4; i >= 0; i--)
	// {
	// 	printf(" %d", a[i]);
	// }

	// // Question No : 16
	// int i;
	// int arr[] = {0, 1, 2, 3, 4};
	// int *ptr;
	// for (ptr = &arr[0], i = 0; i <= 4; i++)
	// {
	// 	printf(" %u", ptr[i]);
	// }

	// Question No: 17
	// int a[] = {0, 1, 2, 3, 4};
	// int i, *p;

	// for (p = a, i = 0; p + i <= a + 4; p++, i++)
	// {
	// 	printf(" %d", *(p + i));
	// }

	// Question No : 19
	// int i;
	// int arr[] = {0, 1, 2, 3, 4};
	// int *ptr;
	// for (ptr = &arr[4], i = 0; i <= 4; i++)
	// {
	// 	printf(" %u", *ptr-i);
	// }

	// Question No : 20
	// int i;
	// int arr[] = {0, 1, 2, 3, 4};
	// int *ptr;
	// for (ptr = arr + 4; ptr >= arr; ptr--)
	// {
	// 	printf(" %u", arr[ptr-arr]);
	// }

	// Question No: 21
	// static int a[] = {0, 1, 2, 3, 4};
	// static int *p[] = {a, a + 1, a + 2, a + 3, a + 4};
	// int **ptr = p;
	// printf("\n %u %u", a, *a);
	// printf("\n %u %u %d", p, *p, **p);
	// printf("\n %u %u %d", ptr, *ptr, ** ptr);

	// Question No: 22
	// static int a[] = {0, 1, 2, 3, 4};
	// static int *p[] = {a, a + 1, a + 2, a + 3, a + 4};
	// int **ptr = p;

	// ptr++;
	// printf("\n %d %d %d", ptr-p, *ptr-a,**ptr);

	// *ptr++;
	// printf("\n %d %d %d", ptr-p, *ptr-a, **ptr);

	// *++ptr;
	// printf("\n %d %d %d", ptr-p, *ptr-a, **ptr);

	// ++*ptr;
	// printf("\n %d %d %d", ptr-p, *ptr-a, **ptr);

	// Question No: 23
	// static int a[] = {0, 1, 2, 3, 4};
	// static int *p[] = {a, a + 1, a + 2, a + 3, a + 4};

	// int **ptr = p;

	// **ptr++;
	// printf("\n %d %d %d", ptr - p, *ptr - a, **ptr);

	// *++*ptr;
	// printf("\n %d %d %d", ptr-p, *ptr-a, **ptr);

	// ++** ptr;
	// printf("\n %d %d %d", ptr-p, *ptr-a, **ptr);

	// Question No: 27
	// static int a[3][3] = {
	// 	1, 2, 3,
	// 	4, 5, 6,
	// 	7, 8, 9};

	// static int *ptr[3] = {a[0], a[1], a[2]};
	// int **ptr1 = ptr;
	// int i;

	// printf("\n");
	// for (int i = 0; i < 3; i++)
	// {
	// 	printf(" %d", *ptr[i]);
	// }

	// printf("\n");
	// for (int i = 0; i < 3; i++)
	// {
	// 	printf(" %d", *a[i]);
	// }

	// printf("\n");
	// for (int i = 0; i < 3; i++)
	// {
	// 	printf(" %d", **ptr1);
	// 	ptr1++;
	// }

	// Question No: 28
	int t[3][2][4] = {
		{
			2,4,3,6,
			1,6,7,9
		},
		{
			8,2,1,1,
			2,3,7,3
		},
		{
			1,6,2,4,
			0,7,9,5
		}
	};

	printf("\n%d %d",t[2][1][3],*(*(*(t+2)+1)+3));

	return 0;
}

// void change(int *b)
// {
// 	int i;
// 	for (int i = 0; i <= 4; i++)
// 	{
// 		*b = *b + 1;
// 		b++;
// 	}
// }