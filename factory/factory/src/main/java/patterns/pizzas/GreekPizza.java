package patterns.pizzas;

import patterns.ingredients.PizzaIngredientFactory;

public class GreekPizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public GreekPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        ingredientFactory.createDough();
        ingredientFactory.createSauce();
        ingredientFactory.createVeggies();
        ingredientFactory.createCheese();
        isPrepared = true;
    }

}