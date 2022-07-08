#include <stdio.h>

int main()
{
    FILE *fptr;
    fptr = fopen("test.txt", "r");
    // if (fptr == NULL)
    // {
    //     printf("File doesn't exist\n");
    // }
    // else
    // {
    //     fclose(fptr);
    // }
    
    // int ch;
    // fscanf(fptr, "%d", &ch);
    // printf("Character = %d\n", ch);
    // fscanf(fptr, "%d", &ch);
    // printf("Character = %d\n", ch);
    // fscanf(fptr, "%d", &ch);
    // printf("Character = %d\n", ch);
    // fscanf(fptr, "%d", &ch);
    // printf("Character = %d\n", ch);
    // fscanf(fptr, "%c", &ch);
    // printf("Character = %c\n", ch);
    // fscanf(fptr, "%c", &ch);
    // printf("Character = %c\n", ch);

    // fprintf(fptr,"%c",'M');
    // fprintf(fptr,"%c",'A');
    // fprintf(fptr,"%c",'N');
    // fprintf(fptr,"%c",'G');
    // fprintf(fptr,"%c",'O');

    // printf("%c\n", fgetc(fptr));
    // printf("%c\n", fgetc(fptr));
    // printf("%c\n", fgetc(fptr));
    // printf("%c\n", fgetc(fptr));
    // printf("%c\n", fgetc(fptr));

    // fputc('M', fptr);
    // fputc('A', fptr);
    // fputc('N', fptr);
    // fputc('G', fptr);
    // fputc('O', fptr);

    char ch;
    ch = fgetc(fptr);
    while (ch != EOF)
    {
        printf("%c",ch);
        ch = fgetc(fptr);
    }
    printf("\n");
    

    fclose(fptr);
    return 0;
}