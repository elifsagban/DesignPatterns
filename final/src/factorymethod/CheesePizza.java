package factorymethod;

public class CheesePizza extends Pizza {


    public CheesePizza(String name, IngredientFactory ingredientFactory) {
        super(name, ingredientFactory.createDough(), ingredientFactory.createSauce(), ingredientFactory.createCheese());
    }


    @Override
    public void prepare() {
        System.out.println(name +"Cheese Pizza is being prepared");
    }
}
