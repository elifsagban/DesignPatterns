package myclasses;
public class HexaDecimalView implements Observer{

    private final NumberPublisher publisher;

    public HexaDecimalView(NumberPublisher subject) {
        this.publisher = subject;
        this.publisher.registerObservers(this);
    }

    public void update() {
    display();


    }
    public void display(){
        System.out.println( "String: " + Integer.toHexString( publisher.getNumber() ).toUpperCase() );

    }
}
