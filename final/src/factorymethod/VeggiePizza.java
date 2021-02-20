package factorymethod;

public class VeggiePizza extends Pizza {


    public VeggiePizza(String name, IngredientFactory ingredientFactory){
        super(name, ingredientFactory.createDough(), ingredientFactory.createSauce(), ingredientFactory.createCheese());
    }


    @Override
    public void prepare() {
        System.out.println(name+"Veggie Pizza is being prepared");
    }
}
