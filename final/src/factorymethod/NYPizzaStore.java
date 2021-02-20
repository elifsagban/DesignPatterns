package factorymethod;

public class NYPizzaStore extends PizzaStore{

    IngredientFactory ingredientFactory = new NYPizzaIngredientFactory();


    public void scheduleDelivery(){
        System.out.println("delivery is schedule");
    }


    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")){
            pizza = new CheesePizza("NY Style ", ingredientFactory);
        }else if (type.equals("veggie")) {
            pizza = new VeggiePizza("NY Style ", ingredientFactory);
        }else{
            return null;
        }
        return pizza;
    }
}
