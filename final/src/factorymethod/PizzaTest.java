package factorymethod;


public class PizzaTest {

    public static void main(String... args){


        NYPizzaStore nps = new NYPizzaStore();

        nps.orderPizza("cheese");


        ChicagoPizzaStore cps = new ChicagoPizzaStore();

        cps.orderPizza("veggie");
    }
}