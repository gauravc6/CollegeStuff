#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main () {
  string a;
  ifstream myfile ("example.txt");
  getline (myfile,a);
	int i,count=1;
for(i=0;a[i]!='\0';++i)
	{
		if(a[i]==' ')
			count++;
	}

	cout<<"\nThere are "<<count<<" words in the given file.";

	return 0;

  return 0;
}
