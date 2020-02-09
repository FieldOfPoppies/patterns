package patterns;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import patterns.pizzas.Pizza;
import patterns.pizzas.PizzaName;

/**
 * Unit test for simple App.
 */
public class NYPizzaStoreTest {

    private NYPizzaStore pizzaStore;

    @Before
    public void beforeEach() {
        pizzaStore = new NYPizzaStore();
    }

    @Test
    public void NYStylePizzaIsMade() {
        Pizza orderedPizza = pizzaStore.createPizza(PizzaName.CHEESE);
        assertTrue("No NY Style Pizza was made", orderedPizza.getName().equals("NYCheesePizza"));
    }

}