package patterns;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import patterns.factories.SimplePizzaFactory;
import patterns.pizzas.Pizza;
import patterns.pizzas.PizzaName;

/**
 * Unit test for simple App.
 */
public class PizzaStoreTest 
{

    private PizzaStore pizzaStore;

    @Before
    public void beforeEach() {
        pizzaStore = new PizzaStore(){
        private SimplePizzaFactory factory = new SimplePizzaFactory();
            @Override
            Pizza createPizza(PizzaName name) {
            return factory.createPizza(name);
            }
        };
    }

    @Test
    public void pizzaIsPrepared() {
        Pizza createdPizza = pizzaStore.orderPizza(PizzaName.CHEESE);
        assertTrue("Pizza is not prepared", createdPizza.isPrepared());
    }

    @Test
    public void pizzaIsBaked() {
        Pizza createdPizza = pizzaStore.orderPizza(PizzaName.CHEESE);
        assertTrue("Pizza is not baked", createdPizza.isBaked());
    }
    @Test
    public void pizzaIsCut() {
        Pizza createdPizza = pizzaStore.orderPizza(PizzaName.CHEESE);
        assertTrue("Pizza is not cut", createdPizza.isCut());
    }
    @Test
    public void pizzaIsBoxed() {
        Pizza createdPizza = pizzaStore.orderPizza(PizzaName.CHEESE);
        assertTrue("Pizza is not boxed", createdPizza.isBoxed());
    }


}