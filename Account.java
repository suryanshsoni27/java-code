
public class Account {
    protected double mbalance;
    protected double mTotalFee = 0;
    protected String mOwner;
    public Account(String owner,double balance){
        mOwner = owner;
        mbalance = balance;
    }
    public double getBalance() {
        return mbalance;
    }

    public String getOwner() {
        return mOwner;
    }
    public double getTotal() {
        return mTotalFee;
    }

    public void deposit(double amount) {
        if(amount <= 0) {
            System.out.println("A negative amount is not allowed in the deposit");
        }
        else
            mbalance += amount;
    }



    public void withdraw(double amount) {
        if(amount<=0) {
            System.out.println("");
        }
        else
            mbalance -= amount;
    }
    public void tell() {
            System.out.println(mOwner + " has " + this.getBalance() + " in the bank. Total fee!" + mTotalFee);
    }

}
