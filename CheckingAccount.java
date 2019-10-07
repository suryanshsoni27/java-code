
public class CheckingAccount extends Account{
    public static double OVERDRAFT_FEE = 35.8;

    public CheckingAccount(String owner,double balance){
       super(owner,balance);
    }

    public void withdraw(double amount) {
        super.withdraw(amount);

        if(mbalance < 0) {
            mTotalFee +=OVERDRAFT_FEE;
        }
    }

}
