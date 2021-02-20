package without;

public class BinaryView {

    public void update(int num) {
        display(num);

    }

    public void display(int num){
        System.out.println(Integer.toBinaryString(num));
    }

}