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
public class GreekPizzaTest {

    @Mock
    PizzaIngredientFactory ingredientFactory;
    GreekPizza greekPizza;

    @Before
    public void beforeEach() {
        MockitoAnnotations.initMocks(this);
        greekPizza = new GreekPizza(ingredientFactory);
    }

    @Test
    public void usesCorrectIngredients() {
        greekPizza.prepare();
        verify(ingredientFactory).createDough();
        verify(ingredientFactory).createSauce();
        verify(ingredientFactory).createVeggies();
        verify(ingredientFactory).createCheese();
        // I should test that only these methods are invoked and only once.
        // I will not do this for this example.
    }

    @Test
    public void isPrepared() {
        greekPizza.prepare();
        assertTrue(greekPizza.isPrepared());

    }
}