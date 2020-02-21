package patterns.ingredients.new_york;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import patterns.ingredients.Cheese;
import patterns.ingredients.Dough;
import patterns.ingredients.Onion;
import patterns.ingredients.Pepperoni;
import patterns.ingredients.Sauce;
import patterns.ingredients.SlicedPepperoni;
import patterns.ingredients.Veggie;

/**
 * Unit test for simple App.
 */
public class NYPizzaIngredientFactoryTest {

    private NYPizzaIngredientFactory nyPizzaIngredientFactory;

    @Before
    public void beforeEach() {
        nyPizzaIngredientFactory = new NYPizzaIngredientFactory();
    }

    @Test
    public void createsThinCrustDough() {
        Dough dough = nyPizzaIngredientFactory.createDough();
        assertTrue(dough instanceof ThinCrustDough);
    }

    @Test
    public void createsMarinaraSauce() {
        Sauce sauce = nyPizzaIngredientFactory.createSauce();
        assertTrue(sauce instanceof MarinaraSauce);
    }

    @Test
    public void createsReggianoCheese() {
        Cheese cheese = nyPizzaIngredientFactory.createCheese();
        assertTrue(cheese instanceof ReggianoCheese);
    }

    @Test
    public void createsVeggies() {
        Veggie[] veggies = nyPizzaIngredientFactory.createVeggies();
        ArrayList<Class<? extends Veggie>> types = getVeggieTypes(veggies);
        assertTrue(types.contains(Garlic.class));
        assertTrue(types.contains(Onion.class));
    }

    @Test
    public void createsSlicedPepperoni() {
        Pepperoni pepperoni = nyPizzaIngredientFactory.createPepperoni();
        assertTrue(pepperoni instanceof SlicedPepperoni);
    }

    private ArrayList<Class<? extends Veggie>> getVeggieTypes(Veggie[] veggies) {
        ArrayList<Class<? extends Veggie>> types = new ArrayList<Class<? extends Veggie>>();
        for (Veggie ingredient : veggies) {
            types.add(ingredient.getClass());
        }
        return types;
    }

}