package without;

public class NumberPublisherDemo {

    public static void main(String[] args) throws InterruptedException {
        BinaryView bView = new BinaryView();
        HexaDecimalView hView = new HexaDecimalView();
        DecimalView dView = new DecimalView();

        NumberPublisher publisher = new NumberPublisher(bView, hView, dView);
        int publishCount = 5;

        for (int i =0; i<publishCount; i++){
            int number = i*20;
            System.out.println("\nPublishing:" + number);
            publisher.publishNumber(number);
            Thread.sleep(1000);
        }

    }

}
