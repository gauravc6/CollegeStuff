#include<stdio.h>
int main()
{
char *ch;
FILE *fp;
fp=fopen("file.txt","r");
ch=getc(fp);
while(ch!= NULL)
{
ch=getc(fp);
printf("%c",ch);
}
}
