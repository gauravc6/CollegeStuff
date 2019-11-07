#include<iostream>
using namespace std;
class Product
{
friend class PrepackedFood;
private:
    long int barcode;
public:
     int funcGrab;
    virtual void dispPre(){cout<<"Hello";}
    virtual void dispFresh(){cout<<"Hello";}
    virtual void amtFresh(){cout<<"Hello";}
    virtual void quanPre(){cout<<"Hello";}
        string products[15]={"Lays Masala Magic","Hair Shampoo Bottle","HideNSeek Biscuits","Bingo Chips","Coke","Apple","Carrots","Water Melon","Papaya","Mango"};
    long int bars[10]={626511,626512,626513,626514,626515,626516,626517,626518,626519,626520};
       int tempbar;

    void Search()
    {
        int check=0;
       tempbar=0;
    for(int i=0;i<=9;i++)
    {
        if(barcode==bars[i])
          {
            barcode=bars[i];
            tempbar=i;
            check=1;
          }
        else
            cout<<"";

    }
    if(check==0)
        cout<<"No such barcode exists."<<endl;
    else
        cout<<"Barcode and Product identified and recorded."<<endl;

    }
    void funcChoose()
    {
        if(tempbar<5)
        {
        quanPre();
        funcGrab=1;
        }
        else
        {
        amtFresh();
        funcGrab=2;
        }}
void printer()
{
    if(funcGrab=1)
        dispPre();
    else
        dispFresh();
}

void getCode()
{
    cout<<"Enter barcode of the desired product:";
    cin>>barcode;
}



};
class PrepackedFood: public Product
{
private:
    int price_tot;
    int unit_price[15]={10,120,20,15,40};
    int quantity;
public:
void quanPre()
{
    cout<<"Enter quantity of the product";
    cin>>quantity;
}
void dispPre()
{
     price_tot=unit_price[tempbar]*quantity;
     cout<<"Barcode entered : "<<bars[tempbar]<<endl;
    cout<<"Product selected : "<<products[tempbar]<<endl;
    cout<<"Price per unit :"<<unit_price[tempbar]<<endl;
    cout<<"Total price to be paid : "<<price_tot<<endl;
}

};
class FreshFood: public Product
{
private:
    float tot_price;
    float price_per_kilo[15]={80,60,70,50,90};
    int barman;
    float amt;
public:
void amtFresh()
{
    cout<<"Enter amount of the product required:";
    cin>>amt;
}
void dispPre()
{
    barman=tempbar-5;
     tot_price=price_per_kilo[barman]*amt;
     cout<<"Barcode entered : "<<bars[tempbar]<<endl;
    cout<<"Product selected : "<<products[tempbar]<<endl;
    cout<<"Price per unit :"<<price_per_kilo[barman]<<endl;
    cout<<"Total price to be paid : "<<tot_price<<endl;
}

};
int main()
{
int products;
int n;
cout<<"Enter number of products:";
cin>>products;
Product p[10];
for(n=0;n<products;n++)
    {
    p[n].getCode();
    p[n].Search();
    }
    cout<<"Bill printing initiated...."<<endl;
for(n=0;n<products;n++)
{
p[n].printer();
}
}
