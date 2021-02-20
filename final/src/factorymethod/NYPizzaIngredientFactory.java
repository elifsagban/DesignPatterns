package factorymethod;

public class NYPizzaIngredientFactory implements IngredientFactory{
    @Override
    public Dough createDough() {
        return new ThinDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Reggiano();
    }
}
