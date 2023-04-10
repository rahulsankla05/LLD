package Adapterdesign;

import Adapterdesign.thirdparty.HdfcBankAPI;

public class HdfcBankApIAdapter implements BankApiAdapter{
    private HdfcBankAPI hdfcBankAPI=new HdfcBankAPI();

    @Override
    public double getbalance(String accountnumber) {
        return 0;
    }
    public double sendmoney(String fromaccount, String toaccount, double amount){
        return 0;
    }
}
