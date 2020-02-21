package patterns.pizzas;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import patterns.ingredients.PizzaIngredientFactory;

/**
 * Unit test for simple App.
 */
public class PepperoniPizzaTest {

    @Mock
    PizzaIngredientFactory ingredientFactory;
    PepperoniPizza pepperoniPizza;

    @Before
    public void beforeEach() {
        MockitoAnnotations.initMocks(this);
        pepperoniPizza = new PepperoniPizza(ingredientFactory);
    }

    @Test
    public void usesCorrectIngredients() {
        pepperoniPizza.prepare();
        verify(ingredientFactory).createDough();
        verify(ingredientFactory).createSauce();
        verify(ingredientFactory).createPepperoni();
        verify(ingredientFactory).createCheese();
        // I should test that only these methods are invoked and only once.
        // I will not do this for this example.
    }

    @Test
    public void isPrepared() {
        pepperoniPizza.prepare();
        assertTrue(pepperoniPizza.isPrepared());

    }
}