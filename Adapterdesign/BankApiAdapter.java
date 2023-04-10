package Adapterdesign;

public interface BankApiAdapter {
    double getbalance(String accountnumber);
    double sendmoney(String fromaccount ,String toaccount, double amount);

}
