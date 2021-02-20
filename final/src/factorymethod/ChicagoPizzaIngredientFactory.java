package factorymethod;

public class ChicagoPizzaIngredientFactory implements IngredientFactory{
    @Override
    public Dough createDough() {
        return new TickDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozerella();
    }
}
