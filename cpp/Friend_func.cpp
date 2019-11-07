#include<iostream>
using namespace std;

class A; // forward declaration of A needed by B

class B
{
public:
    void fB(A& a);
    void fB2(A& a);
};

class A
{
public:
    friend void B::fB(A& a);
    void fA(){}
};
