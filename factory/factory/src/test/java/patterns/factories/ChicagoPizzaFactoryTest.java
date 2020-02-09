package patterns.factories;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import patterns.factories.SimpleChicagoPizzaFactory;
import patterns.pizzas.Pizza;
import patterns.pizzas.PizzaName;

/**
 * SimplePizzaFactoryTest
 */
public class ChicagoPizzaFactoryTest {

    @Test
    public void returnsACheesePizza(){
        Pizza createdPizza = new SimpleChicagoPizzaFactory().createPizza(PizzaName.CHEESE);
        assertEquals("ChicagoCheesePizza", createdPizza.getName());
    }

    @Test
    public void returnsAgreekPizza() {
        Pizza createdPizza = new SimpleChicagoPizzaFactory().createPizza(PizzaName.GREEK);
        assertEquals("ChicagoGreekPizza", createdPizza.getName());
    }

    @Test
    public void returnsAPepperoniPizza() {
        Pizza createdPizza = new SimpleChicagoPizzaFactory().createPizza(PizzaName.PEPPERONI);
        assertEquals("ChicagoPepperoniPizza", createdPizza.getName());
    }
}