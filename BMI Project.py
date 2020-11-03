from tkinter import *
from tkinter import messagebox
root = Tk()
root.geometry("300x200")
root.title("BMI Calculator")


def calculate():
    h_mt = height.get()/100
    w_kg = weight.get()
    bmi = w_kg / h_mt**2
    status=""
    if bmi < 18.5:
        status = "Underweight"
    elif 18.5 <= bmi < 24.9:
        status = "Normal"
    elif 24.9 <= bmi < 29.9:
        status = "Overweight"
    else:
        status = "Obese"

    messagebox.showinfo(title = "Result", message=f"Your BMI is {bmi} and you are {status}")


def clear():
    height.set(0)
    weight.set(0)


Label(root, text="Welcome to BMI Calculator").grid(row=1, column=2)
Label(root, text="Height(cm)").grid(row=2, column=1)
Label(root, text="Weight(kg)").grid(row=3, column=1)

height = DoubleVar()
weight = DoubleVar()

Entry(root, textvariable=height).grid(row=2, column=2)
Entry(root, textvariable=weight).grid(row=3, column=2)

Button(root, text="Submit", command= calculate).grid(row=4, column=1)
Button(root, text="Clear", command= clear).grid(row=4, column=2)
Button(root, text="Exit", command = quit).grid(row=4, column=3)
root.mainloop()
