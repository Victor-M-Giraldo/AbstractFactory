public class AbstractFactory{


    public static void main(String[] args) {

        PizzaStore NyStore = new NYPizzaStore();
        Pizza NyTest = NyStore.createPizza("cheese");
        System.out.println(NyTest.toString());

        PizzaStore ChicagoStore = new ChicagoPizzaStore();
        Pizza ChicagoTest = ChicagoStore.createPizza("veggie");
        System.out.println(ChicagoTest.toString());

        PizzaStore NyStoreTwo = new NYPizzaStore();
        Pizza NyTestTwo = NyStoreTwo.createPizza("pepperoni");
        System.out.println(NyTestTwo.toString());

        PizzaStore ChicagoStoreTwo = new ChicagoPizzaStore();
        Pizza ChicagoTestTwo = ChicagoStoreTwo.createPizza("clam");
        System.out.println(ChicagoTestTwo.toString());
    }
}