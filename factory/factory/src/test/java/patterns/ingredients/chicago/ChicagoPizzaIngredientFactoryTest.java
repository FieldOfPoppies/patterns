package patterns.ingredients.chicago;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import patterns.ingredients.*;

/**
 * Unit test for simple App.
 */
public class ChicagoPizzaIngredientFactoryTest {

    private ChicagoPizzaIngredientFactory chicagoPizzaIngredientFactory;

    @Before
    public void beforeEach() {
        chicagoPizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
    }

    @Test
    public void createsThinCrustDough() {
        Dough dough = chicagoPizzaIngredientFactory.createDough();
        assertTrue(dough instanceof ThickCrustDough);
    }

    @Test
    public void createsMarinaraSauce() {
        Sauce sauce = chicagoPizzaIngredientFactory.createSauce();
        assertTrue(sauce instanceof PlumTomatoSauce);
    }

    @Test
    public void createsReggianoCheese() {
        Cheese cheese = chicagoPizzaIngredientFactory.createCheese();
        assertTrue(cheese instanceof MozarellaCheese);
    }

    @Test
    public void createsVeggies() {
        Veggie[] veggies = chicagoPizzaIngredientFactory.createVeggies();
        ArrayList<Class<? extends Veggie>> types = getVeggieTypes(veggies);
        assertTrue(types.contains(Onion.class));
        assertTrue(types.contains(Spinach.class));
    }

    @Test
    public void createsSlicedPepperoni() {
        Pepperoni pepperoni = chicagoPizzaIngredientFactory.createPepperoni();
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