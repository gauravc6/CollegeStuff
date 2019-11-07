#include<stdio.h>
void main() 
{

        int a[10][10];
        int i, j, r, c, f = 1;

        printf("Enter the order of the matrix A \n");
        scanf("%d %d", &r, &c);

        printf("Enter the elements of matrix A \n");
        for (i = 0; i < r; i++)
        {
            for (j = 0; j < c; j++)
            {
                scanf("%d", &a[i][j]);
            }
        }

        printf("Matrix A is \n");
        for (i = 0; i < r; i++)
        {
            for (j = 0; j < c; j++)
            {
                printf("%3d", a[i][j]);
            }
            printf("\n");
        }

        for (i = 0; i < r; i++)
        {
            for (j = 0; j < c; j++)
            {
                if (a[i][j] != 1 && a[j][i] != 0)
                {
                    f = 0;
                    break;
                }
            }
        }

        if (f == 1 )
            printf("It is identity matrix \n");

        else
            printf("It is not a identity matrix \n");

}
