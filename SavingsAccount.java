public class SavingsAccount extends Account {

    public static double monthly_fee = 100.0;
    public static int count = 0;
    public static int total = 5;

    public SavingsAccount(String owner, double balance) {
        super(owner, balance);
    }


    public void deposit(double amount) {
        super.deposit(amount);
        if (amount > 100) {
            System.out.println("no monthly fee deduction applied");
        }
        else if(amount < 0) {
            System.out.println("negative amount can not be deposited");
        }
        else {
            mTotalFee += monthly_fee;
            mbalance -= monthly_fee;
            System.out.println("monthly deduction has been charged at an amount of $"
                    + monthly_fee
                    + "\nyour total amount left in the account is $"
                    + mbalance);
        }
    }

    public void withdraw(double amount) {
        ++count;
        if (amount > mbalance) {
            System.out.println("cant withdraw such amount");
        }
        else if(amount < 0) {
            System.out.println("negative amount cannot be withdrawn");

        }
        else {
            if (count > 5) {
                System.out.println("Limit for the number of times you can withdraw from account this month exceeded.");
            }
            else {
                System.out.println("You can withdraw no more than 5 times --\"" + (total - count) + "\" --these many withdrawals left ");
                super.withdraw(amount);
            }



        }


    }
}
