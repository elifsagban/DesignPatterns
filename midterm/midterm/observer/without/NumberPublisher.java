package without;

public class NumberPublisher {

    BinaryView bView;
    HexaDecimalView hView;
    DecimalView dView;


    public NumberPublisher(BinaryView bView, HexaDecimalView hView, DecimalView dView) {
        this.bView = bView;
        this.hView = hView;
        this.dView = dView;
    }


    public void publishNumber(int num){
        bView.update(num);
        hView.update(num);
        dView.update(num);
    }

}
