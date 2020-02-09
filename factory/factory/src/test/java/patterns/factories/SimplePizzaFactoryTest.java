package patterns.factories;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import patterns.factories.SimplePizzaFactory;
import patterns.pizzas.Pizza;
import patterns.pizzas.PizzaName;

/**
 * SimplePizzaFactoryTest
 */
public class SimplePizzaFactoryTest {

    @Test
    public void returnsACheesePizza(){
        Pizza createdPizza = new SimplePizzaFactory().createPizza(PizzaName.CHEESE);
        assertEquals("CheesePizza", createdPizza.getName());
    }

    @Test
    public void returnsAgreekPizza() {
        Pizza createdPizza = new SimplePizzaFactory().createPizza(PizzaName.GREEK);
        assertEquals("GreekPizza", createdPizza.getName());
    }

    @Test
    public void returnsAPepperoniPizza() {
        Pizza createdPizza = new SimplePizzaFactory().createPizza(PizzaName.PEPPERONI);
        assertEquals("PepperoniPizza", createdPizza.getName());
    }
}