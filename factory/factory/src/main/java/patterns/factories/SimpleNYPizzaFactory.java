package patterns.factories;

import patterns.ingredients.PizzaIngredientFactory;
import patterns.ingredients.new_york.NYPizzaIngredientFactory;
import patterns.pizzas.CheesePizza;
import patterns.pizzas.GreekPizza;
import patterns.pizzas.PepperoniPizza;
import patterns.pizzas.Pizza;
import patterns.pizzas.PizzaName;

/**
 * SimplePizzaFactory
 */
public class SimpleNYPizzaFactory implements IPizzaFactory {

    public Pizza createPizza(PizzaName name) {
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        Pizza orderedPizza = null;

        switch (name) {
            case CHEESE:
                orderedPizza = new CheesePizza(ingredientFactory);
                orderedPizza.setName("NYCheesePizza");
                break;
            case GREEK:
                orderedPizza = new GreekPizza(ingredientFactory);
                orderedPizza.setName("NYGreekPizza");
                break;
            case PEPPERONI:
                orderedPizza = new PepperoniPizza(ingredientFactory);
                orderedPizza.setName("NYPepperoniPizza");
                break;
            default:
                break;
        }
        return orderedPizza;
    }

}