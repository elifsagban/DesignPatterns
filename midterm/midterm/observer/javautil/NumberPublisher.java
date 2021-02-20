package javautil;
import java.util.Observable;
import java.util.Observer;

public class NumberPublisher extends Observable{

    private int number;



    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
        publishNumber();

    }

    public void publishNumber(){
        setChanged();
        notifyObservers();
    }








}
