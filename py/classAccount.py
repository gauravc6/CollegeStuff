class Account:
    def __init__(self,accountNumber: int,firstName: str,lastName: str,accountBalance: float):
        self.accountNumber = accountNumber if accountNumber>10001 else 0
        self.firstName = firstName
        self.lastName = lastName
        self.accountBalance = accountBalance if accountBalance>0 else 0
    def display(self):
        print(self.accountNumber)
        print(self.firstName)
        print(self.lastName)
        print(self.accountBalance)
a = Account(10002,'Gaurav','Ramani',2500)
a.display()
