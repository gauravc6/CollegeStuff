from tkinter import *
from tkinter import messagebox, Entry

hourlySalary = [150.00,200.00,250.00]
def calcSalary():
    hoursWorked = e.get()
    taxRate = tax.get()
    grossPay = hoursWorked*hourlySalary[skill.get()-1]
    incomeTax = grossPay*taxRate/100
    netPay = grossPay - incomeTax
    messagebox.showinfo("Salary",f" Gross Pay: ₹{grossPay} \n Income Tax: ₹{incomeTax} \n Net Pay: ₹{netPay}")
window = Tk()
skill = IntVar()
tax = IntVar()
e = IntVar()
window.title("Calculate Payroll")
window.geometry("300x300")
Label(window, text="Hours worked").grid(row=0,padx=100)
Entry(window,textvariable=e).grid(row=1)
Label(window,text='Choose your skill group').grid(row=2)
Radiobutton(window,text="1",variable=skill,value=1).grid(row=3)
Radiobutton(window,text="2",variable=skill,value=2).grid(row=4)
Radiobutton(window,text="3",variable=skill,value=3).grid(row=5)
Label(window,text='Choose your tax category rate').grid(row=6)
Radiobutton(window,text='Single Rate',variable=tax,value=18).grid(row=7)
Radiobutton(window,text='Family Rate',variable=tax,value=15).grid(row=8)
Button(window,text="Show Salary",command=calcSalary).grid(row=10)
window.mainloop()
