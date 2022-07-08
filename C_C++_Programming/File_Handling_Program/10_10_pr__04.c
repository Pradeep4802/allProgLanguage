#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main()
{
    FILE *ptr;
    int n;
    // printf("Enter the number of enteries: ");
    // scanf("%d", &n);
    char s1[20];
    // char s2[10] = "Nikhil";
    int sal[2] = {12000, 21000};
    ptr = fopen("pr_04.txt", "w");
    // for (int i = 0; i < n; i++)  
    // {
    //     printf("Enter the name: ");
    //     scanf("%s",s);
    //     printf("Enter the salary: ");
    //     scanf("%d", &sal[i]);
    for (; strlen(gets(s1)) > 0;)
    {
        fgets(s1,14,ptr);
        // fgets("\n",ptr);
        // fprintf(ptr, "\t%d", sal[i]);
    }
    for (int i = 0; strlen(gets(s1)) > 0; i++)
    {
        fputs(s1,ptr);
        fprintf(ptr, "\t%d\n", sal[i]);
    }

    // }
    // if (ptr == NULL)
    // {
    //     puts("Cannot opwn file");
    //     exit(1);
    // }
    // printf("\nEnter a few line of text:\n");
    // while (strlen(gets(s)) > 0)
    // {
    //     fputs(s, ptr);
    //     fputs("\n", ptr);
    // }

    // for (int i = 0; i < n; i++)
    // {
    //     fputc(s);
    //     fprintf(ptr,"\t%d\n",sal[i]);
    // }

    fclose(ptr);

    return 0;
}