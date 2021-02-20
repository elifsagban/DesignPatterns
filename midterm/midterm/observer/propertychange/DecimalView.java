package propertychange;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Observable;
import java.util.Observer;

public class DecimalView implements PropertyChangeListener {


    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        Data data = (Data) evt.getNewValue();
        System.out.println("Decimal: " + data.getNumber());

    }


    
}
