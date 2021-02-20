package pattern2;

public class Soldier {
    String name;

    String attackBehaviour;
    String moveBehaviour;

    public void setAttackBehaviour(String attackBehaviour) {
        this.attackBehaviour = attackBehaviour;
    }

    public void setMoveBehaviour(String moveBehaviour) {
        this.moveBehaviour = moveBehaviour;
    }

    public Soldier(String name) {
        this.name = name;
    }


    public void attack() {
        switch (attackBehaviour) {
            case "knife" :
                System.out.println("Attacking with knife");
                break;
            case "gun" :
                System.out.println("Attacking with gun");
                break;
            case "sword" :
                System.out.println("Attacking with sword");
                break;
        }
    }

    public String getName() {
        return name;
    }

    public void move() {
        switch (moveBehaviour) {
            case "walking" :
                System.out.println("Walking");
                break;
            case "running" :
                System.out.println("Running");
                break;
            case "horse riding" :
                System.out.println("Horse Riding");
                break;
        }
    }
}
