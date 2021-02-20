package myclasses;
public class NumberPublisherDemo {

    public static void main(String[] args) throws InterruptedException {


        NumberPublisher subject = new NumberPublisher();
        new BinaryView(subject);
        new HexaDecimalView(subject);
        new DecimalView(subject);



        int publishCount = 5;

        for (int i =0; i<publishCount; i++){
            int number = i*20;
            System.out.println("\nPublishing with Observer Interface:" + number);
            subject.NumberPublisher(number);
            Thread.sleep(1000);
        }

    }
}
