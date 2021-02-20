package state;

public class OutOfMoneyState implements ATMState{
    ATMMachine ATM;
    public OutOfMoneyState(ATMMachine atmMachine) {
        ATM = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Out of Money! Can not accept card.");

    }

    @Override
    public void insertPin() {
        System.out.println("Out of Money! Can not accept card.");

    }

    @Override
    public void requestCash() {
        System.out.println("Out of Money! You cannot request a money.");

    }

    @Override
    public void ejectCard() {
        ATM.setState(ATM.noCardState);
        System.out.println("Your card is ejected");

    }
}
