package pattern1;

public class MusicSystem extends CondimentDecorator{

    public MusicSystem(Features features) {
        super(features);
        description = "Music System";
    }

    @Override
    public int cost() {
        // TODO Auto-generated method stub
        return 1000 + features.cost();
    }


    
}
