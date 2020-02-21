package patterns.pizzas;

import patterns.ingredients.PizzaIngredientFactory;

/**
 * CheesePizza
 */
public class CheesePizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        ingredientFactory.createDough();
        ingredientFactory.createSauce();
        ingredientFactory.createCheese();
        isPrepared = true;
    }

}