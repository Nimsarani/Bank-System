import java.sql.SQLOutput;
import java.util.*;
public class BankSystem {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        double balance=0;
        boolean isRunning=true;
        int choice;

        while(isRunning){
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");

            System.out.println("Enter your choice(1-4): ");
            choice = input.nextInt();

            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance-=withdraw(balance);
                case 4 -> isRunning=false;
                default -> System.out.println("Invalid");
            }

        }
        System.out.println("Thank you! Have a nice day...");
    }

    static void showBalance(double balance){
        System.out.println("_________________");
        System.out.printf("$%.2f\n",balance);

    }
    static double deposit(){
        double amount;
        System.out.print("Enter an amount to be deposited; ");
        amount=input.nextDouble();

        if(amount<0) {
            System.out.println("Amount can't be negative");
            return 0;
        }else{
            return amount;
        }

    }
    static double withdraw(double balance){

        double amount;

        System.out.println("Enter amount to be withdraw: ");
        amount = input.nextDouble();

        if(amount>balance){
            System.out.println("Insufficient funds");
            return 0;
        }else if(amount<0){
            System.out.println("Amount can't be negative");
            return 0;
        }else{
            return amount;
        }



    }

}