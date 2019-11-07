#include<iostream>
using namespace std;
class allSum
{
public:
    void print(int i,float j)
    {
        cout<<"Addition is : "<<i+j<<endl;
    }
    void print(float a,float b)
    {
        cout<<"Addition is : "<<a+b<<endl;
    }
    void print(double q, double w)
    {
        cout<<"Addition is : "<<q+w<<endl;
    }
    void print(string m, string n)
    {
        cout<<"Addition of the strings is : "<<m<<n<<endl;
    }
};
int main()
{
    allSum pd;
    pd.print(20,2532.5623f);
    pd.print(20.56,45.23);
    pd.print(2356.4521,4512.3265);
    pd.print("Hello","World");
    }

