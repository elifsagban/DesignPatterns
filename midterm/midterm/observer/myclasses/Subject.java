package myclasses;

public interface Subject {
    void registerObservers(Observer observer);
    void removeObservers(Observer observer);
    void notifyObservers();
	
}
