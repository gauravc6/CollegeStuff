#include<iostream>
#include<fstream>
using namespace std;
int main()
{
ofstream file;
file.open("f1.txt",ios::binary);
file<<"Frosty";
}
