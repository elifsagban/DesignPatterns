package state;

public class HasCardState implements ATMState{
    ATMMachine ATM;

    public HasCardState(ATMMachine atmMachine) {
        ATM = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("ATM Machine already has a card inside, you cannot insert another one!");

    }

    @Override
    public void insertPin() {
        System.out.println("Your pin is correct!");
        ATM.setState(ATM.hasCorrectPinstate);

    }

    @Override
    public void requestCash() {
        System.out.println("You should enter your pin first");

    }

    @Override
    public void ejectCard() {
        ATM.setState(ATM.noCardState);
        System.out.println("Card is returned!");

    }
}
