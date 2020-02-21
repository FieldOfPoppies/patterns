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
public class CheesePizzaTest {

    @Mock
    PizzaIngredientFactory ingredientFactory;
    CheesePizza cheesePizza;

    @Before
    public void beforeEach() {
        MockitoAnnotations.initMocks(this);
        cheesePizza = new CheesePizza(ingredientFactory);
    }

    @Test
    public void usesCorrectIngredients() {
        cheesePizza.prepare();
        verify(ingredientFactory).createDough();
        verify(ingredientFactory).createSauce();
        verify(ingredientFactory).createCheese();
        // I should test that only these methods are invoked and only once.
        // I will not do this for this example.
    }

    @Test
    public void isPrepared() {
        cheesePizza.prepare();
        assertTrue(cheesePizza.isPrepared());

    }
}