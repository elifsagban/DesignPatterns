package javautil;
public class NumberPublisherDemo {

    public static void main(String[] args) throws InterruptedException {


        NumberPublisher publisher = new NumberPublisher();

        new BinaryView(publisher);
        new HexaDecimalView(publisher);
        new DecimalView(publisher);




        int publishCount = 5;

        for (int i =0; i<publishCount; i++){
            int number = i*20;
            System.out.println("\nPublishing with java.util:" + number);
            publisher.setNumber(number);
            Thread.sleep(1000);
        }

    }
}
