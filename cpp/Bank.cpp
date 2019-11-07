#include <iostream>
#include <string.h>
#include<fstream>
using namespace std;
class Bank
{
private:
    float amt=0;
    string name;
    int accNum;
    int accType;
    string accTypeName;
public:
    ofstream recordFile;
    ofstream recordsCopy;
int accSwitch(int x)
{
    switch(x)
    {
case 1:
    accTypeName="SB account";
    break;
case 2:
    accTypeName="Current Account";
    break;
    }

}
void input()
{
cout<<"Enter the customer name: ";
cin>>name;
}
void amtin()
{
    cout<<"Enter base amount:(Amount must be>700)"<<endl;
cin>>amt;
if(amt<700)
{cout<<"Improper amount. Re-enter base amount."<<endl;
    amtin();}
else
    accInput();
}
void writeFile()
{
    recordFile.open("Record1.txt");

        recordFile<<accNum<<name<<accTypeName;
            recordFile.close();
    }
    void createCopy()
    {
        recordFile.open("Record1.txt");
        recordsCopy.open("Record1_copy.txt");
        recordsCopy << recordFile;
    }

void accInput()
{
cout<<"Choose your account type: "<<endl;
cout<<"1.SB account "<<endl;
cout<<"2.Current account "<<endl;
cin>>accType;
if(accType!=1 && accType!=2)
    {cout<<"Incorrect input. Choose a from the given options";
    accInput();}
else
    accSwitch(accType);
}
void Display()
{
    cout<<"Name of the customer: "<<name<<endl;
  cout<<"Randomized account number: ";

  cout<<endl;
  cout<<"Account type: "<<accTypeName<<endl;
  cout<<"Balance amount: "<<amt<<endl;
}
void process()
  {
int n;
float addamt,withamt,tempamt;
  cout<<"Choose your process: "<<endl;
  cout<<"1.Deposit."<<endl;
  cout<<"2.Withdrawal."<<endl;
  cout<<"3.exit"<<endl;
  cin>>n;
  switch(n)
  {case 1:
      {cout<<"Enter amount to be deposited:"<<endl;
      cin>>addamt;
      amt=amt+addamt;
      cout<<"Amount added!!"<<endl;
      Display();
      break;}
  case 2:
      {cout<<"Enter amount to be withdrawn:"<<endl;
      cin>>withamt;
      tempamt=amt-withamt;
      if(withamt>amt)
      {
          cout<<"******Error!******"<<endl<<"Withdraw amount more than current balance."<<endl;
        cout<<"Current account status:"<<endl;
        Display();
        process();
      }
      else if(tempamt<700)
        {cout<<"******Error!******"<<endl<<"Amount remaining in the back account after withdrawal is less than base amount. Retry please."<<endl;
      cout<<"Current account status:"<<endl;
        Display();
        process();
        }
      else
        {
        amt=amt-withamt;
        cout<<"Current account status:"<<endl;
        Display();}
        break;}
  case 3:
      cout<<"Program exited."<<endl;
  }}
};
int main()
{
  cout<<"Welcome to Indian Bank"<<endl;
  cout<<"Initializing new account creation..."<<endl;
  Bank a;
  a.input();
  a.amtin();
  a.process();
}
