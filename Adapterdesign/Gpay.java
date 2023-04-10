package Adapterdesign;

public class Gpay {
    private BankApiAdapter bankApi;

//    Object injection of Adapter class//
    public Gpay(BankApiAdapter bankApi){
        this.bankApi=bankApi;

    }
    double dosomething() throws InterruptedException{
        double currentbalance=bankApi.getbalance("accountnumber");
        Thread.sleep(25*24*60*60*1000);
        return currentbalance*2;
    }
}
