package patterns;

import patterns.factories.SimpleChicagoPizzaFactory;
import patterns.pizzas.Pizza;
import patterns.pizzas.PizzaName;

/**
 * ChicagoPizzaStore
 */
public class ChicagoPizzaStore extends PizzaStore {

    private SimpleChicagoPizzaFactory factory = new SimpleChicagoPizzaFactory();

    @Override
    Pizza createPizza(PizzaName name) {
        return factory.createPizza(name);
    }

    
}