#include<iostream>
#include<fstream>
using namespace std;
int main()
{
    ifstream file1;
    ifstream file2;
    ofstream file3;
    string c;
    file1.open("myfile1.txt");
    file2.open("myfile2.txt");
    file3.open("myfile3.txt",ios::app);
   getline(file1,c);
        file3<<c;
    getline(file2,c);
        file3<<"\n"<<c;

}
