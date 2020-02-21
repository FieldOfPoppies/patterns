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

## Factory Method:
- separate usage and implementation of the product
- ensure that same logic is applied to all products (dev doesn't need to remember)
- logic and product instantiation can still be tested separately


## Abstract Factory
- define creation of families of related or dependent products
- decouple logic from actual factories (easy replacement of factories)
- decouple logic applied on objects from their instantiation (same logic applied on all products)
- 