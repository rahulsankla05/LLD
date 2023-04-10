package Adapterdesign;

import Adapterdesign.thirdparty.AxisBankAPI;

public class AxisBankAPIAdapter implements BankApiAdapter{
    private AxisBankAPI AxisbankApi = new AxisBankAPI();

    public double getbalance(String accountnumber){
        return 0;
    }
    public double sendmoney(String fromaccount ,String toaccount, double amount){
        return 0;
    }
}
