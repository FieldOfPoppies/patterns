package patterns.ingredients.new_york;

import patterns.ingredients.Cheese;
import patterns.ingredients.Dough;
import patterns.ingredients.Onion;
import patterns.ingredients.Pepperoni;
import patterns.ingredients.PizzaIngredientFactory;
import patterns.ingredients.Sauce;
import patterns.ingredients.SlicedPepperoni;
import patterns.ingredients.Veggie;

/**
 * NYPizzaIngredientFactory
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggie[] createVeggies() {
        Veggie veggies[] = { new Garlic(), new Onion() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
}