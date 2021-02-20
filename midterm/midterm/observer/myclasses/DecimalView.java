package myclasses;
public class DecimalView implements Observer{
    private final NumberPublisher publisher;

    public DecimalView(NumberPublisher subject) {
        this.publisher = subject;
        this.publisher.registerObservers(this);
    }

    public void update() {
        display();


    }
    public void display(){
        System.out.println( "Decimal: " + publisher.getNumber());


    }
}
