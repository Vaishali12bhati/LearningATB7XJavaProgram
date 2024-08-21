package August.ex_11082024.Abstractionconcept.Bankexample;

public class Banks  extends Withdraw{

    @Override
    void account_open() {
        System.out.println("i recently open a coount in your branch");

    }
    @Override
    void Amount_deposit() {
        System.out.println("i have deposite amt balance 200 in new account");

    }
    @Override
    void eligibleforloan() {
        System.out.println("i am eligible for loan");

    }


    @Override
    void amoumtwithdraw() {
        System.out.println("i need to withdraw amt for downpayment");


    }

}

