package patterns;

import patterns.pizzas.CheesePizza;
import patterns.pizzas.GreekPizza;
import patterns.pizzas.PepperoniPizza;
import patterns.pizzas.Pizza;
import patterns.pizzas.PizzaName;

/**
 * SimplePizzaFactory
 */
public class SimplePizzaFactory {

    public Pizza createPizza(PizzaName name) {

        Pizza orderedPizza = null;
        
        switch (name) {
        case CHEESE:
            orderedPizza = new CheesePizza();
            break;
        case GREEK:
            orderedPizza = new GreekPizza();
            break;
        case PEPPERONI:
            orderedPizza = new PepperoniPizza();
            break;
        default:
            break;
        }
        return orderedPizza;
    }
    
}