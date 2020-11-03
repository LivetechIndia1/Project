print("Welcome to the ATM")
bal = 10000
val = "y"
pin = 1234


def enterPin(pin):
    error_count = 1
    p = int(input("Enter pin: "))
    while p != pin:
        print("Wrong pin. Try again")
        p = int(input("Enter pin: "))
        error_count += 1
        if error_count == 3:
            break
    return p
   
       

   


def options():                     #options function
    print('''
Select an option:
1. Withdraw
2. Deposit
3. Check Balance
''')


def withdraw(bal):                     # withdraw function
    wdraw_amt = int(input("Enter amount to withdraw: "))
    new_bal = bal - wdraw_amt
    print("Your balance is ",new_bal)
    return new_bal
               


def deposit(bal):                       #deposit function
    dep_amt = int(input("Enter amount to deposit: "))
    new_bal = bal + dep_amt
    print("Your balance is ",new_bal)
    return new_bal
   

def checkBal(bal):                       #check balance function
    print("Your balance is ",bal)


   
while val == "y":
    if pin != enterPin(pin):
        print("You have been blocked")
        break
   
    options()
    opt = int(input("Selection: "))
    if opt == 1:
             bal = withdraw(bal)
    elif opt == 2:
             bal = deposit(bal)
    elif opt == 3:
              checkBal(bal)
    else:
              print("Pick a valid option")

    val = input("y to continue, n to exit ")

print("Thank you for using the ATM")
