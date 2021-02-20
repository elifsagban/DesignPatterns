package javautil;

import java.util.Observable;
import java.util.Observer;

public class HexaDecimalView implements Observer {
    private NumberPublisher publisher;

    public HexaDecimalView(NumberPublisher publisher) {
        this.publisher = publisher;
        this.publisher.addObserver(this);
    }


    @Override
    public void update(Observable observable, Object o) {

        NumberPublisher publisher = (NumberPublisher) observable;
        System.out.println( "Hex: " + Integer.toHexString( publisher.getNumber() ).toUpperCase() );

    }
}
