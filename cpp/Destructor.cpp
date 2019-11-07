#include <iostream>
using namespace std;
class A
 {
   public:
        A()
        {
            cout<<"Constructor Invoked of class A"<<endl;
        }
        ~A()
        {
            cout<<"Destructor Invoked of class A"<<endl;
        }
};
class B: public A
 {
   public:
        B()
        {
            cout<<"Constructor Invoked of class B"<<endl;
        }
        ~B()
        {
            cout<<"Destructor Invoked of class B"<<endl;
        }
};
class C: public A
 {
   public:
        C()
        {
            cout<<"Constructor Invoked of class C"<<endl;
        }
        ~C()
        {
            cout<<"Destructor Invoked of class C"<<endl;
        }
};
class D: public A
 {
   public:
        D()
        {
            cout<<"Constructor Invoked of class D"<<endl;
        }
        ~D()
        {
            cout<<"Destructor Invoked of class D"<<endl;
        }
};
int main()
{
    A o1;
    B o2;
    C o3;
    D o4;
    return 0;
}
