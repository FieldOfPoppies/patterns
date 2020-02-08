package patterns;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import patterns.pizzas.Pizza;
import patterns.pizzas.PizzaName;

/**
 * Unit test for simple App.
 */
public class PizzaStoreTest 
{
    @Test
    public void returnsACheesePizza(){
        Pizza createdPizza = new PizzaStore().orderPizza(PizzaName.CHEESE);
        assertEquals("CheesePizza", createdPizza.getName());
    }

    @Test
    public void returnsAgreekPizza(){
        Pizza createdPizza = new PizzaStore().orderPizza(PizzaName.GREEK);
        assertEquals("GreekPizza", createdPizza.getName());
    }

    @Test
    public void returnsAPepperoniPizza(){
        Pizza createdPizza = new PizzaStore().orderPizza(PizzaName.PEPPERONI);
        assertEquals("PepperoniPizza", createdPizza.getName());
    }

    //First Drawback even now: since object creation and usage is not separated we test the logic
    //for only one concrete pizza (or have a lot of duplicated tests)
    @Test
    public void pizzaIsPrepared() {
        Pizza createdPizza = new PizzaStore().orderPizza(PizzaName.CHEESE);
        assertTrue("Pizza is not prepared", createdPizza.isPrepared());
    }

    @Test
    public void pizzaIsBaked() {
        Pizza createdPizza = new PizzaStore().orderPizza(PizzaName.CHEESE);
        assertTrue("Pizza is not baked", createdPizza.isBaked());
    }
    @Test
    public void pizzaIsCut() {
        Pizza createdPizza = new PizzaStore().orderPizza(PizzaName.CHEESE);
        assertTrue("Pizza is not cut", createdPizza.isCut());
    }
    @Test
    public void pizzaIsBoxed() {
        Pizza createdPizza = new PizzaStore().orderPizza(PizzaName.CHEESE);
        assertTrue("Pizza is not boxed", createdPizza.isBoxed());
    }


}