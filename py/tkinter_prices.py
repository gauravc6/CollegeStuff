from tkinter import *
from tkinter import messagebox
def showPrice():
    messagebox.showinfo("Price",prices[items.index(v.get())])
window = Tk()
v = StringVar()
window.title("IKEA Store")
window.geometry("400x400")
#Radiobutton(window,text="chair",variable=v,value="chair").grid(row=0,column=0)
#Radiobutton(window,text="table",variable=v,value="table").grid(row=0,column=1)

items = ['sofa','night stand','futon','recliner']
prices = [1000,2300,4100,4500]
for i in items:
    Radiobutton(window,text=i,variable=v,value=i).grid(row=0,column=items.index(i))

Button(window,text="Show price",command=showPrice).grid(row=6,column=2)
window.mainloop()
