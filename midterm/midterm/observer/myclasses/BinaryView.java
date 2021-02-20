package myclasses;
public class BinaryView implements Observer {
    private NumberPublisher publisher;

    public BinaryView(NumberPublisher subject) {
        this.publisher = subject;
        this.publisher.registerObservers(this);
    }



	public void update() {
        display();


    }
    public void display(){
        System.out.println( "Binary: " + Integer.toBinaryString( publisher.getNumber() ).toUpperCase() );


    }
}
