package state;

public class TestATMMachine {

    public static void main(String... args){
        //Create machine and set the current amount of money in the machine
        ATMMachine machine = ATMMachine.getInstance();
        ATMMachine machine2 = ATMMachine.getInstance();

        machine.setBalance(25000);

        System.out.println("Double-checked with the Singleton");

        if (System.identityHashCode(machine) == System.identityHashCode(machine2)){
            System.out.println("ATMs are the same!");
            System.out.println("");
        }else{
            System.out.println("ATMs are different");
        }

        machine.insertCard("cardnumber");
        machine.insertPin("pin");
        machine.requestCash(3000);
        machine.ejectCard();

        machine.insertCard("cardnumber2");
        machine.insertPin("pin2");
        machine.requestCash(5000);
        machine.requestCash(2000);
        machine.ejectCard();

    }
}
