package patterns.factories;

import patterns.pizzas.Pizza;
import patterns.pizzas.PizzaName;
import patterns.pizzas.chicago.ChicagoCheesePizza;
import patterns.pizzas.chicago.ChicagoGreekPizza;
import patterns.pizzas.chicago.ChicagoPepperoniPizza;

/**
 * SimplePizzaFactory
 */
public class SimpleChicagoPizzaFactory implements IPizzaFactory {

    public Pizza createPizza(PizzaName name) {

        Pizza orderedPizza = null;
        
        switch (name) {
        case CHEESE:
            orderedPizza = new ChicagoCheesePizza();
            break;
        case GREEK:
            orderedPizza = new ChicagoGreekPizza();
            break;
        case PEPPERONI:
            orderedPizza = new ChicagoPepperoniPizza();
            break;
        default:
            break;
        }
        return orderedPizza;
    }
    
}