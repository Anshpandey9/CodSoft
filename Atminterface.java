import java.util.*;

class ATM{
    double balance = 0.0;

    Scanner sc=new Scanner(System.in);

    public void menu(){
        System.out.println("Enter your choice");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check balance");
        System.out.println("4. Exit");
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                deposit();
                break;
            case 2:
                withdraw();
                break;
            case 3:
                checkbalance();
                break;
            case 4:
                System.out.println("Thank you. ");
            default:
                System.out.println("invalid choice");
                menu();
        }
    }
    public void deposit(){
        System.out.println("Enter your deposit amount: ");
        double amount = sc.nextDouble();
        if(amount>0){
            balance=balance+amount;
            System.out.println("Your amount is successfully deposit");
        }
        else {
            System.out.println("Invalid! Enter the amount in positive.");
        }
        menu();
    }
    public void withdraw(){
        System.out.println("Enter your withdraw amount.");
        double amount = sc.nextDouble();
        if(amount>balance){
            System.out.println("Insufficient balance. ");
        }
        else{
            balance=balance-amount;
            System.out.println("Your amount withdraw Successfully.");
        }
        menu();
    }
    public void checkbalance(){
        System.out.println("Balance " + balance);
        menu();
    }
}
public class Atminterface {
    public static void main(String[] args) {
         ATM obj = new ATM();
         obj.menu();
         obj.deposit();
         obj.withdraw();
         obj.checkbalance();
    }
}
