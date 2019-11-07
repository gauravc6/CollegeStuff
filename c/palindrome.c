#include<stdio.h>
void main() //Gaurav Chandiramani 18BCE10099
{
char str[100], rstr[100] = {'\0'};
    int  i, l = 0, flag = 0;

    fflush(stdin);
    printf("Enter a string \n");
    gets(str);
    /*  keep going through each character of the string till its end */
    for (i = 0; str[i] != '\0'; i++)
    {
        l++;
    }
    for (i = l - 1; i >= 0; i--)
    {
       rstr[l - i - 1] = str[i];
    }
    for (i = 0; i < l; i++)
    {
        if (rstr[i] == str[i])
            flag = 1;
        else
            flag = 0;
    }
    if (flag == 1)
        printf("%s is a palindrome \n", str);
    else
        printf("%s is not a palindrome \n", str);
}
