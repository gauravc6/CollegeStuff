#include<iostream>
#include<fstream>
using namespace std;
class Student
{
private:
    string studentName;
    char studentRoll[8];
    char branch[3];
    char DOB[9];
public:
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
    }
    void writeFile()
    {
        recordFile.open("Record1.txt", ios::ate | ios::app);
           recordFile<<"\n"<<studentName;
           recordFile<<"\t"<<studentRoll;
           recordFile<<"\t"<<branch;
           recordFile<<"\t"<<DOB;
            recordFile.close();
    }
    void createCopy()
    {
        recordFile.open("Record1.txt");
        recordsCopy.open("Record1_copy.text");
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
   cout<<"Writing to the file.";
for(int i=0;i<a;i++)
    {q[i].writeFile();}
    cout<<"All new data written to the file.";}
