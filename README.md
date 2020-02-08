# What is this?
Example Implementations of Design Patterns

# Why the ****
Just for me to learn and remember. Go away... 


# Benefits of Refactorings

## Simple Factory:
- separated what varies (pizza creation) from what stays the same (making the pizza)
- PizzaStore has no dependencies to concrete Pizzas anymore
- Tests don't require the PizzaStore to work with a certain Pizza (or all of them)
- Tests can inject stubs easily to test PizzaStores logic
- PizzaStore now follows the Open-Closed principle
