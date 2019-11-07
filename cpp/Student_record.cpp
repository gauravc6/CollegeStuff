#include<iostream>
#include<fstream>
using namespace std;
class Student
{
private:
    string studentName;
    string studentRoll;
    string branch;
    string DOB;
public:
    int marks1,marks2;
    float avg;
    char choice1,choice2;
    ofstream recordFile;
    ofstream recordsCopy;
    void getDetails()
    {
        cout<<"Enter name of the student:"<<endl;
        cin>>studentName;
        cout<<"Enter student Registration number: (ex: 18BEC10092)"<<endl;
        cin>>studentRoll;
        cout<<"Enter branch: (format ex: CSE)"<<endl;
        cin>>branch;
        cout<<"Enter date of birth: (format ex: DD-MM-YYYY)"<<endl;
        cin>>DOB;
        cout<<"Enter marks for CSE and Maths:";
        cin>>marks1>>marks2;
        avg=(marks1 + marks2)/2;

    }
    void writeFile()
    {
        recordFile.open("Record1.txt");

        recordFile<<studentName<<studentRoll<<branch<<DOB<<marks1<<marks2;
            recordFile.close();
    }
    void createCopy()
    {
        recordFile.open("Record1.txt");
        recordsCopy.open("Record1_copy.txt");
        recordsCopy << recordFile;
    }
};

int main()
{
    int a;
    char b;
    char choice1;
    char choice2;
    int n;
    cout<<"Enter amount of records you want to enter"<<endl;
    cin>>a;
    Student q[1000];
    for(int i=0;i<a;i++)
    {q[i].getDetails();}
    cout<<"Write all contents to the file?(Y/N)";
    cin>>choice1;
    if(choice1=='y' || choice1=='Y')
   {for(int i=0;i<a;i++)
    {q[i].writeFile();}
    cout<<"Contents written successfully to the file.";}
    else if(choice1=='n' || choice1=='N')
    cout<<"Proceeding without writing contents to the file.";
    else
       {
    cout<<"Invalid input.Retry:(Y/N)";
    }
    cout<<"Make copy of newly edited file?(Y/N)";
    cin>>choice2;
    if(choice2=='y' || choice2=='Y')
    {q[a].createCopy();
    cout<<"Copy successfully created.";}
    else if(choice2=='n' || choice2=='N')
    cout<<"Proceeding without writing contents to the file.";
    else
            cout<<"Invalid choice";


}
