package patterns.factories;

import patterns.ingredients.PizzaIngredientFactory;
import patterns.ingredients.chicago.ChicagoPizzaIngredientFactory;
import patterns.pizzas.*;

/**
 * SimplePizzaFactory
 */
public class SimpleChicagoPizzaFactory implements IPizzaFactory {

    public Pizza createPizza(PizzaName name) {
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        Pizza orderedPizza = null;

        switch (name) {
            case CHEESE:
                orderedPizza = new CheesePizza(ingredientFactory);
                orderedPizza.setName("ChicagoCheesePizza");
                break;
            case GREEK:
                orderedPizza = new GreekPizza(ingredientFactory);
                orderedPizza.setName("ChicagoGreekPizza");
                break;
            case PEPPERONI:
                orderedPizza = new PepperoniPizza(ingredientFactory);
                orderedPizza.setName("ChicagoPepperoniPizza");
                break;
            default:
                break;
        }
        return orderedPizza;
    }

}