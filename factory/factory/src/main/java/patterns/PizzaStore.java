package patterns;

import patterns.pizzas.Pizza;
import patterns.pizzas.PizzaName;

public abstract class PizzaStore {

    /*
    * This is the factory method (pattern). 
    * Now we can ensure, that a product (here: Pizza) is always treated the same way, .i.e., 
    * the same methods are invoked on it. Now it is impossible to forget calling one of them
    * and getting into an undefined state.
    */
    abstract Pizza createPizza(PizzaName name);

    public Pizza orderPizza(PizzaName name) {
        Pizza orderedPizza = createPizza(name);

        orderedPizza.prepare();
        orderedPizza.bake();
        orderedPizza.cut();
        orderedPizza.box();

        return orderedPizza;
    }


    
}