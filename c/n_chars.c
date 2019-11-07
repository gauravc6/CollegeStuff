#include<stdio.h>
 #include<string.h>
 void main()
 {
     char name[100][80], tn[100][80], t[80];
        int i, j, n;
        printf("Enter the value of n \n");
        scanf("%d", &n);
        printf("Enter %d names n\n",n);

        for (i = 0; i < n; i++)
        {
            scanf("%s", name[i]);
            strcpy(tn[i], name[i]);
        }
        printf("Printing names with there length:\n");
          for (i = 0; i < n; i++)
        {
            printf("%s - %d\n",name[i],strlen(name[i]));

        }}
