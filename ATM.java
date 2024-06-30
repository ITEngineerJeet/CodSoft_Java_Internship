/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atm;

/**
 *
 * @author HP
 */

import java.util.*;

class BankAccount 
{
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("$" + amount + " deposited successfully.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("$" + amount + " withdrawn successfully.");
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}


public class ATM {

    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome to the CommonWealth Bank ATM!");
        System.out.println("What would you like to do?");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        
        System.out.print("Enter Your Choice : ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                checkBalance();
                break;
            case 2:
                depositMoney();
                break;
            case 3:
                withdrawMoney();
                break;
            case 4:
                exit();
                break;
            default:
                System.out.println("Invalid choice. Please choose again.");
                start();
                break;
        }
    }

    private void checkBalance() {
        System.out.println("Your balance is: $" + account.getBalance());
        restartOrExit();
    }

    private void depositMoney() {
        System.out.println("Enter deposit amount:");
        double amount = scanner.nextDouble();
        account.deposit(amount);
        restartOrExit();
    }

    private void withdrawMoney() {
        System.out.println("Enter withdrawal amount:");
        double amount = scanner.nextDouble();
        account.withdraw(amount);
        restartOrExit();
    }

    private void exit() {
        System.out.println("Thank you for using the ATM!");
        scanner.close();
    }

    private void restartOrExit() {
        System.out.println("Would you like to do another transaction? (yes/no)");
        scanner.nextLine(); // Consume newline left-over
        String response = scanner.nextLine().toLowerCase();
        if (response.equals("yes")) {
            start();
        } else {
            exit();
        }
    }

    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000); // Initialize with $1000 balance
        ATM atm = new ATM(userAccount);
        atm.start();
    }
}

/* The Ouput of this code is 
Welcome to the CommonWealth Bank ATM!
What would you like to do?
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Enter Your Choice : 2
Enter deposit amount:
300000
$300000.0 deposited successfully.
Would you like to do another transaction? (yes/no)
yes
Welcome to the CommonWealth Bank ATM!
What would you like to do?
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Enter Your Choice : 1
Your balance is: $301000.0
Would you like to do another transaction? (yes/no)
yes
Welcome to the CommonWealth Bank ATM!
What would you like to do?
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Enter Your Choice : 2
Enter deposit amount:
400000
$400000.0 deposited successfully.
Would you like to do another transaction? (yes/no)
yes
Welcome to the CommonWealth Bank ATM!
What would you like to do?
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Enter Your Choice : 1
Your balance is: $701000.0
Would you like to do another transaction? (yes/no)
yes
Welcome to the CommonWealth Bank ATM!
What would you like to do?
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Enter Your Choice : 3
Enter withdrawal amount:
5000
$5000.0 withdrawn successfully.
Would you like to do another transaction? (yes/no)
yes
Welcome to the CommonWealth Bank ATM!
What would you like to do?
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Enter Your Choice : 1
Your balance is: $696000.0
Would you like to do another transaction? (yes/no)
no
Thank you for using the ATM!
*/