package patterns.factories;

import patterns.pizzas.Pizza;
import patterns.pizzas.PizzaName;

/**
 * IPizzaFactory
 */
public interface IPizzaFactory {

    public Pizza createPizza(PizzaName name);
}