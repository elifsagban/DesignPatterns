package without;

public class HexaDecimalView {
    public void update(int num) {
        display(num);

    }

    public void display(int num){
        System.out.println(Integer.toHexString(num));
    }
}