package myclasses;
import java.util.ArrayList;
import java.util.List;

public class NumberPublisher implements Subject{

    List<Observer> observers = new ArrayList<>();
    private int number;



    public int getNumber() {
        return number;
    }


    public void publishNumber(){
        notifyObservers();
    }

    @Override
    public void registerObservers(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObservers(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers){
            observer.update();

        }

    }

    public void NumberPublisher(int number) {
        this.number = number;
        publishNumber();

    }


}
