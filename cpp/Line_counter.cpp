#include <iostream>
#include <fstream>
using namespace std;
int main () {
    string a;
    int counter=0;
  ifstream myfile ("example.txt");
  while(getline (myfile,a))
	counter++;
	cout<<"Number of lines is "<<counter<<"."<<endl;
}
