package propertychange;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Observable;
import java.util.Observer;

public class NumberPublisher {

    Data data =  new Data();
    PropertyChangeSupport support;

    public NumberPublisher() {
        support = new PropertyChangeSupport(this);
    }

    public void addObserver(PropertyChangeListener listener){
        support.addPropertyChangeListener(listener);
    }

    public int getPublish(){
        return data.getNumber();
    }
    public void setPublish(int number){
        data.setNumber(number);
        
        publishNumber();
    }

    public void publishNumber(){
        support.firePropertyChange("published", null, data);
    }








}
