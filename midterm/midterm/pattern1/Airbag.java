package pattern1;

public class Airbag extends CondimentDecorator{

    public Airbag(Features features) {
        super(features);
        description = "Airbag";
    }

    @Override
    public int cost() {
        // TODO Auto-generated method stub
        return 3000 + features.cost();
    }

    
}
