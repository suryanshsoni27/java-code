import java.util.Scanner;


public class MyClass {
    public static void main(String[] args) {
        Account myAccount1 = new CheckingAccount("Suryansh", 5000);
        Account myAccount2 = new SavingsAccount("Suryansh", 600);
        Scanner scan = new Scanner(System.in);
        int ch;
        System.out.println("Banking program");
        do { System.out.println("what acount do you wanna enter to?(1 for checking , 2 for savings)");
            int c = scan.nextInt();
            if (c == 1) {
                System.out.println(myAccount1.getOwner() + " has $" + myAccount1.getBalance() + " in the account");
                System.out.println("what do you wanna do enter 1 for deposit 2 for withdraw");
                int cc = scan.nextInt();
                if (cc == 1) {
                    System.out.println("enter the amount you want to deposit");
                    double amount = scan.nextDouble();
                    myAccount1.deposit(amount);
                    myAccount1.tell();
                } else if (cc == 2) {
                    System.out.println("enter the amount you want to withdraw");
                    double amount = scan.nextDouble();
                    myAccount1.withdraw(amount);
                    myAccount1.tell();
                }

            } else if (c == 2) {
                System.out.println(myAccount2.getOwner() + " has $" + myAccount2.getBalance() + " in the account");
                System.out.println("what do you wanna do enter 1 for deposit 2 for withdraw");
                int cc = scan.nextInt();
                if (cc == 1) {
                    System.out.println("enter the amount you want to deposit(***if you enter atleast 100 your monthly charges will be waived****");
                    double amount = scan.nextDouble();
                    myAccount2.deposit(amount);
                    myAccount2.tell();
                } else if (cc == 2) {
                    System.out.println("enter the amount you want to withdraw");
                    double amount = scan.nextDouble();
                    myAccount2.withdraw(amount);
                    myAccount2.tell();
                }
            } else {
                System.out.println("no accounts exist for the input");
            }
            System.out.println("do you wanna enter more ? 1 for yes / 0 for no");
            ch = scan.nextInt();
        }while(ch == 1);





    }

}
