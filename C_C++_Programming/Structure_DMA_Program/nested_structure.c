#include <stdio.h>

struct book
{
    char publisher[20];
    char origin[20];
    int edition;
};

struct kitab
{
    int code;
    char Name[20];
    char author[20];
    int pages;
    struct book b1;
} b2[3];

int main()
{
    int i;
    int icode;

    for (i = 0; i < 3; i++)
    {
        printf("\n Enter the Code of the book:>> ");
        scanf("%d", &b2[i].code);

        printf("\n Enter the Name of the book:>> ");
        scanf("%s", b2[i].Name);

        printf("\n Enter the Name of the Author:>> ");
        scanf("%s", b2[i].author);

        printf("\n Enter the Number of Pages:>> ");
        scanf("%d", &b2[i].pages);

        printf("\n Enter the publisher:>> ");
        scanf("%s", b2[i].b1.publisher);

        printf("\n Enter the origin:>> ");
        scanf("%s", b2[i].b1.origin);

        printf("\n Enter the edition of the book:>> ");
        scanf("%d", &b2[i].b1.edition);
    }

    printf("\n Enter the icode:>>");
    scanf("%d", &icode);

    for (i = 0; i < 3; i++)
    {
        if (b2[i].code == icode)
        {
            printf("\n Name = %s", b2[i].Name);
            printf("\n Author Name = %s", b2[i].author);
            printf("\n Pages = %d", b2[i].pages);
            printf("\n Publisher = %s", b2[i].b1.publisher);
            printf("\n Origin = %s", b2[i].b1.origin);
            printf("\n Edition = %d", b2[i].b1.edition);
        }
    }

    return 0;
}