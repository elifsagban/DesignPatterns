package pattern1;

public class Sunroof extends CondimentDecorator{

    public Sunroof(Features features) {
        super(features);
        description = "Sunroof";
    }

    @Override
    public int cost() {
        // TODO Auto-generated method stub
        return 2000 + features.cost();
    }


}
