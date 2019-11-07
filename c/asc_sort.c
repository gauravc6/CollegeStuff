#include<stdio.h>
void main()
{
    int i, j, a, n, b[100];
        printf("Enter the number of array elements \n");
        scanf("%d", &n);

        printf("Enter the numbers \n");
        for (i = 0; i < n; ++i)
            scanf("%d", &b[i]);

        for (i = 0; i < n; ++i)
        {

            for (j = i + 1; j < n; ++j)
            {

                if (b[i] > b[j])
                {

                    a =  b[i];
                    b[i] = b[j];
                    b[j] = a;

                }

            }

        }

        printf("The numbers arranged in ascending order are given below \n");
        for (i = 0; i < n; ++i)
            printf("%d\n", b[i]);}
