public class AbstractFactory{


    public static void main(String[] args) {



        PizzaStore NyStore = new NYPizzaStore();
    

        PizzaStore ChicagoStore = new ChicagoPizzaStore();

        Pizza nyPizza = NyStore.orderPizza("cheese");

        System.out.println("Ordered a pizza from NY: " + nyPizza);

        Pizza ChicagoPizza = ChicagoStore.orderPizza("veggie");

        System.out.println("Ordered a pizza from Chicago " + ChicagoPizza);


    
    }
}