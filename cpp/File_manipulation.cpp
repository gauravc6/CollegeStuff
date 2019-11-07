#include<iostream>
#include<fstream>
#include<iomanip>
using namespace std;
int main()
{
ifstream clientF("clients.dat", ios::in);
    int account;
    char name[50]; double balance;
while(clientF>>name>>balance>>account)
{
    cout<<setiosflags(ios::left)<<setw(10)<<account<<setw(17)<<name<<setw(7)<<setprecision(2)<<resetiosflags(ios::left)<<balance<<endl;

}
}
