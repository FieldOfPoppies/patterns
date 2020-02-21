package patterns.ingredients.chicago;

import patterns.ingredients.Cheese;
import patterns.ingredients.Dough;
import patterns.ingredients.Onion;
import patterns.ingredients.Pepperoni;
import patterns.ingredients.PizzaIngredientFactory;
import patterns.ingredients.Sauce;
import patterns.ingredients.SlicedPepperoni;
import patterns.ingredients.Veggie;

/**
 * ChicagoIngredientFactory
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozarellaCheese();
    }

    @Override
    public Veggie[] createVeggies() {
        Veggie veggies[] = { new Spinach(), new Onion() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

}