package pattern1;

public abstract class CondimentDecorator extends Features{
    protected Features features;
    
    public CondimentDecorator(Features features){
        this.features = features;
    }
    public String getDescription(){
        return features.getDescription() + " + " + description;
    }
}
