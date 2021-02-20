package state;

public class NoCardState implements ATMState{
    ATMMachine ATM;

    public NoCardState(ATMMachine atmMachine) {
        ATM = atmMachine;
    }

    @Override
    public void insertCard() {
        ATM.setState(ATM.hasCardState);
        System.out.println("Card with "+ATM.CardNumber+ " has been inserted");
    }

    @Override
    public void insertPin() {
        System.out.println("Card has not been inserted");

    }

    @Override
    public void requestCash() {
        System.out.println("You have to insert your card first.");

    }

    @Override
    public void ejectCard() {
        System.out.println("Card has not been inserted");

    }
}
