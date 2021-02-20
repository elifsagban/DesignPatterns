package state;

public class HasCorrectPinState implements ATMState{
    ATMMachine ATM;

    public HasCorrectPinState(ATMMachine atmMachine) {
        ATM = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You entered your pin.");

    }

    @Override
    public void insertPin() {
        System.out.println("You entered your pin.");

    }

    @Override
    public void requestCash() {
        System.out.println("Your request is: "+ ATM.amount + "TL");
        if (ATM.getBalance() < ATM.amount){
            ATM.setState(ATM.outOfMoneyState);
            System.out.println("ATM Machine is out of money!");
        }else if (ATM.getBalance() >= ATM.amount){
            ATM.withdrawMoney(ATM.amount);
            System.out.println("ATM Machine's current balance is: "+ATM.balance +"TL");
        }



    }



    @Override
    public void ejectCard() {
        ATM.setState(ATM.noCardState);
        System.out.println("Your card is ejected!");
        System.out.println("");



    }
}
