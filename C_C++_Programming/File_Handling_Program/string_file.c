#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main()
{
    FILE *ptr;
    int n;
    // printf("Enter the number of enteries: ");
    // scanf("%d", &n);
    char s[80];
    int sal[n];
    ptr = fopen("POEM.txt", "w");
    // for (int i = 0; i < n; i++)
    // {
    //     printf("Enter the name: ");
    //     scanf("%s",s);
    //     printf("Enter the salary: ");
    //     scanf("%d", &sal[i]);
    // }
    if (ptr == NULL)
    {
        puts("Cannot opwn file");
        exit(1);
    }
    printf("\nEnter a few line of text:\n");
    while (strlen(gets(s)) > 0)
    {
        fputs(s, ptr);
        fputs("\n", ptr);
    }

    // for (int i = 0; i < n; i++)
    // {
    //     fputc(s);
    //     fprintf(ptr,"\t%d\n",sal[i]);
    // }

    fclose(ptr);

    printf("File contents are being read now..\n", s);
    ptr = fopen("POEM.txt", "r");
    if (ptr == NULL)
    {
        puts("Cannot open file");
        exit(2);
    }
    while (fgets(s, 79, ptr) != NULL)
    {
        printf("%s", s);
    }
    fclose(ptr);

    return 0;
}