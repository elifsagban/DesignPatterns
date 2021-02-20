package pattern2;

public class Main {
    public static void main(String[] args) {

        //Enemy's Behaviour
        Soldier enemySoldier = new Soldier("Enemy");

        System.out.println( enemySoldier.getName() + " is ");
        enemySoldier.setMoveBehaviour("horse riding");
        enemySoldier.move();

        System.out.println( enemySoldier.getName() + " is ");
        enemySoldier.setAttackBehaviour("sword");
        enemySoldier.attack();

        System.out.println(" ");
        //Soldier Elif's Behaviour
        Soldier soldier = new Soldier("Elif");

        System.out.println("Soldier " + soldier.getName() + " is ");
        soldier.setMoveBehaviour("running");
        soldier.move();

        System.out.println("Soldier " + soldier.getName() + " is ");
        soldier.setAttackBehaviour("gun");
        soldier.attack();






    }
}
