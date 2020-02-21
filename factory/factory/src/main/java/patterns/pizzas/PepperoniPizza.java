package patterns.pizzas;

import patterns.ingredients.PizzaIngredientFactory;

/**
 * PepperoniPizza
 */
public class PepperoniPizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        ingredientFactory.createDough();
        ingredientFactory.createSauce();
        ingredientFactory.createPepperoni();
        ingredientFactory.createCheese();
        isPrepared = true;
    }

}