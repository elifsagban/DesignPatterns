package javautil;

import java.util.Observable;
import java.util.Observer;

public class DecimalView implements Observer {
    private NumberPublisher publisher;

    public DecimalView(NumberPublisher publisher) {
        this.publisher = publisher;
        this.publisher.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object o) {
        NumberPublisher publisher = (NumberPublisher) observable;
        System.out.println( "Decimal: " + publisher.getNumber());


    }
}
