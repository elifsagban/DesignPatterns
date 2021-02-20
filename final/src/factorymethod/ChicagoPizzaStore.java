package factorymethod;


public class ChicagoPizzaStore extends PizzaStore{

    IngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")){
            pizza = new CheesePizza("Chicago Style ", ingredientFactory);
        }else if (type.equals("veggie")) {
            pizza = new VeggiePizza("Chicago Style ", ingredientFactory);
        }else{
            return null;
        }
        return pizza;
    }
}