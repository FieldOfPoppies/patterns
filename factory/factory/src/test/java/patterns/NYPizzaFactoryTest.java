package patterns;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import patterns.pizzas.Pizza;
import patterns.pizzas.PizzaName;

/**
 * SimplePizzaFactoryTest
 */
public class NYPizzaFactoryTest {

    @Test
    public void returnsACheesePizza(){
        Pizza createdPizza = new NYPizzaFactory().createPizza(PizzaName.CHEESE);
        assertEquals("NYCheesePizza", createdPizza.getName());
    }

    @Test
    public void returnsAgreekPizza() {
        Pizza createdPizza = new NYPizzaFactory().createPizza(PizzaName.GREEK);
        assertEquals("NYGreekPizza", createdPizza.getName());
    }

    @Test
    public void returnsAPepperoniPizza() {
        Pizza createdPizza = new NYPizzaFactory().createPizza(PizzaName.PEPPERONI);
        assertEquals("NYPepperoniPizza", createdPizza.getName());
    }
}