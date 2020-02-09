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
public class ChicagoPizzaStoreTest {

    private ChicagoPizzaStore pizzaStore;

    @Before
    public void beforeEach() {
        pizzaStore = new ChicagoPizzaStore();
    }

    @Test
    public void ChicagoStylePizzaIsMade() {
        Pizza orderedPizza = pizzaStore.createPizza(PizzaName.CHEESE);
        assertTrue("No Chicago Style Pizza was made", orderedPizza.getName().equals("ChicagoCheesePizza"));
    }

}