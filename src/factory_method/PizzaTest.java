package factory_method;

public class PizzaTest {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();
        PizzaStore californiaStore = new CaliforniaStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Pizza 1: " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Pizza 2: " + pizza.getName() + "\n");

        pizza = californiaStore.orderPizza("pepperoni");
        System.out.println("Pizza 3: " + pizza.getName() + "\n");
    }
}
