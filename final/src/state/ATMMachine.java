package state;

public class ATMMachine {

    private static volatile ATMMachine instance;

    static ATMState noCardState;
    static ATMState hasCardState;
    static ATMState outOfMoneyState;
    static ATMState hasCorrectPinstate;


    static ATMState state;
    String CorrectPin;
    String CardNumber;
    int amount;
    int balance;


    public ATMMachine() {

    }
    public void setBalance(int balance) {
        this.balance = balance;
        //If ATM has money start the states
        if (balance > 0){
            state = noCardState;
        }else{
            System.out.println("You entered a wrong balance!");
        }
    }

    public static ATMMachine getInstance(){
        if (instance == null){
            synchronized (ATMMachine.class){
                if (instance == null){
                    instance = new ATMMachine();
                }
            }
            noCardState = new NoCardState(instance);
            hasCardState = new HasCardState(instance);
            outOfMoneyState = new OutOfMoneyState(instance);
            hasCorrectPinstate = new HasCorrectPinState(instance);

        }
        return instance;
    }

    public void insertCard(String CardNumber) {
        this.CardNumber = CardNumber;
        state.insertCard();
    }

    public void insertPin(String CorrectPin) {
        this.CorrectPin = CorrectPin;
        state.insertPin();
    }
    /*       if (CorrectPin == "pin"){
               state.requestCash();
           }else if (CorrectPin == "pin2")
               state.requestCash();
    */
    public void requestCash(int amount) {
        this.amount= amount;
        state.requestCash();
    }

    public void ejectCard() {
        state.ejectCard();
    }

    public void setState(ATMState state) {
        this.state = state;
    }

    //Check the ATM balance, if not enough no money should withdrawed
    public void withdrawMoney(int amount) {
        this.amount= amount;
        if (this.amount <= balance){
            balance = balance - this.amount;
            System.out.println("You withdrawed "+ this.amount + "TL");
        }else {
            state = outOfMoneyState;
            System.out.println("ATM Machine has out of money!");
        }
    }
    public int getBalance(){
        return balance;
    }
}
