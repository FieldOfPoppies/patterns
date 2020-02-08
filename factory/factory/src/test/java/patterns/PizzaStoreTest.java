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
public class PizzaStoreTest 
{

    private SimplePizzaFactory factory;

    @Before
    public void beforeEach() {
        this.factory = new SimplePizzaFactory();
    }

    @Test
    public void pizzaIsPrepared() {
        Pizza createdPizza = new PizzaStore(factory).orderPizza(PizzaName.CHEESE);
        assertTrue("Pizza is not prepared", createdPizza.isPrepared());
    }

    @Test
    public void pizzaIsBaked() {
        Pizza createdPizza = new PizzaStore(factory).orderPizza(PizzaName.CHEESE);
        assertTrue("Pizza is not baked", createdPizza.isBaked());
    }
    @Test
    public void pizzaIsCut() {
        Pizza createdPizza = new PizzaStore(factory).orderPizza(PizzaName.CHEESE);
        assertTrue("Pizza is not cut", createdPizza.isCut());
    }
    @Test
    public void pizzaIsBoxed() {
        Pizza createdPizza = new PizzaStore(factory).orderPizza(PizzaName.CHEESE);
        assertTrue("Pizza is not boxed", createdPizza.isBoxed());
    }


}