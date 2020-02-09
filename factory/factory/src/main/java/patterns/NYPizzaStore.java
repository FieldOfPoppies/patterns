package patterns;

import patterns.factories.SimpleNYPizzaFactory;
import patterns.pizzas.Pizza;
import patterns.pizzas.PizzaName;

/**
 * NYPizzaStore
 */
public class NYPizzaStore extends PizzaStore {

    private SimpleNYPizzaFactory factory = new SimpleNYPizzaFactory();

    @Override
    Pizza createPizza(PizzaName name) {
        return factory.createPizza(name);
    }

    
}