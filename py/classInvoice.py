class Invoice:
    def __init__(self,invNum,saleAmt):
        self.invNum = invNum
        self.saleAmt = saleAmt
        self.saleTax = 8.5*saleAmt/100
    def display(self):
        print("Invoice number: " + str(self.invNum))
        print("Sale Amount: " + str(self.saleAmt))
        print("Sales Tax: " + str(self.saleTax))
inv = int(input('Enter invoice number:'))
amt = int(input('Enter amount of sales made:'))
while inv>20001 or inv<10001 or amt<0:
    print('Invalid inputs. Retry with invoice number between 10001 and 20001 and sales amount > 0.')
    inv = int(input('Enter invoice number:'))
    amt = int(input('Enter amount of sales made:'))
a = Invoice(inv,amt)
a.display()
