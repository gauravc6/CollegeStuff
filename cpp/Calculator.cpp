#include<iostream>
using namespace std;
class Calculator
{
private:
    float a,b;
public:
    void input()
    {
        cout<<"Calculator initiated.";
        cout<<"Enter 2 numbers:"<<endl;
        cin>>a>>b;

    }
    void add()
    {
    float sum;
    sum=a+b;
    cout<<"a+b="<<sum;
    }
    void sub()
    {
        float sub;
        sub=a-b;
        cout<<"a-b="<<sub;
    }
    void mult()
    {
        float mul;
        mul=a*b;
        cout<<"a*b="<<mul;
    }
    void div()
    {
        float div;
        div=a/b;
        cout<<"a/b="<<div;
    }
};
int main()
{
    int q;
Calculator c;
c.input();
cout<<"Choose one of the iterations below:"<<endl;
        cout<<"1. Addition"<<endl;
        cout<<"2. Subtraction"<<endl;
        cout<<"3. Multiplication"<<endl;
        cout<<"4. Division"<<endl;
        cout<<"0. Exit program"<<endl;
        cin>>q;
        switch(q)
        {
        case 1:
            c.add();
            break;
        case 2:
            c.sub();
            break;
        case 3:
            c.mult();
            break;
        case 4:
            c.div();
            break;
        default:
            cout<<"Invalid input program exited.";
        }

}

