package patterns;

import patterns.pizzas.Pizza;
import patterns.pizzas.PizzaName;
import patterns.pizzas.new_york.NYCheesePizza;
import patterns.pizzas.new_york.NYGreekPizza;
import patterns.pizzas.new_york.NYPepperoniPizza;

/**
 * SimplePizzaFactory
 */
public class NYPizzaFactory {

    public Pizza createPizza(PizzaName name) {

        Pizza orderedPizza = null;
        
        switch (name) {
        case CHEESE:
            orderedPizza = new NYCheesePizza();
            break;
        case GREEK:
            orderedPizza = new NYGreekPizza();
            break;
        case PEPPERONI:
            orderedPizza = new NYPepperoniPizza();
            break;
        default:
            break;
        }
        return orderedPizza;
    }
    
}