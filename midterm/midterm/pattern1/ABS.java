package pattern1;

public class ABS extends CondimentDecorator{

    public ABS(Features features) {
        super(features);
        description = "ABS";
    }

    @Override
    public int cost() {
        // TODO Auto-generated method stub
        return 5000 + features.cost();
    }


}
