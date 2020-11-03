# -*- coding: utf-8 -*-
"""
Created on Thu Oct  8 13:36:18 2020

@author: Anish
"""

from tkinter import *
import tkinter.font as font
import joblib as jl
import tkinter.messagebox
e=jl.load(r"C:\Users\abc\anaconda3\Anish's Model.h5")

def fun():
    A=float(a1.get())
    B=float(b1.get())
    C=float(c1.get())
    D=float(d1.get())
    f=e.predict([[A,B,C,D]])
    tkinter.messagebox.showinfo("Here is your answer",'The type of the flower is {}'.format(f[0]))

a=Tk()
a.title('Welcome to the ultimate MODEL')
a.geometry("1000x500")
a.resizable(0,0)
Label(a,text="Enter the petal length").grid(row=0,column=0)
Label(a,text='Enter the petal width') .grid(row=1,column=0)
Label(a,text='Enter the sepal length').grid(row=2,column=0)
Label(a,text="Enter the sepal width") .grid(row=3,column=0)
a1=Entry(a)
a1.grid(row=0,column=1)
b1=Entry(a)
b1.grid(row=1,column=1)
c1=Entry(a)
c1.grid(row=2,column=1)
d1=Entry(a)
d1.grid(row=3,column=1)
Button (a,text='PREDICT',command=fun).grid(row=4,column=1)