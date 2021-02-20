package state;

public interface ATMState {
    void insertCard();
    void insertPin();
    void requestCash();
    void ejectCard();
}
