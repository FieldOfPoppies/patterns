package patterns;

import patterns.pizzas.CheesePizza;
import patterns.pizzas.GreekPizza;
import patterns.pizzas.PepperoniPizza;
import patterns.pizzas.Pizza;
import patterns.pizzas.PizzaName;

public class PizzaStore {
    public Pizza orderPizza(PizzaName name) {
        Pizza orderedPizza = null;

        /*this is likely to vay (new pizzas, old removed etc.)
        * the implementation is not closed to modification, because
        * it needs to be touched whenever the pizza menu changes
        */
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

        //this will not change that much
        orderedPizza.prepare();
        orderedPizza.bake();
        orderedPizza.cut();
        orderedPizza.box();

        return orderedPizza;

    }
}