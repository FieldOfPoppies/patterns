package patterns;

import patterns.pizzas.Pizza;
import patterns.pizzas.PizzaName;

public class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory){
        this.factory = factory;
    }

    public Pizza orderPizza(PizzaName name) {
        Pizza orderedPizza = factory.createPizza(name);

        orderedPizza.prepare();
        orderedPizza.bake();
        orderedPizza.cut();
        orderedPizza.box();

        return orderedPizza;
    }

    
}