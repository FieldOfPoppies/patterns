# What is this?
Example Implementations of Design Patterns
all content is from: Head First Design Patterns (wonderful book :))

# Why the ****
Just for me to learn and remember. Go away... 

# Starting Point:
let's assume the is a pizza store and it looks like this: [doc](./documentation/FirstImplementation.md)

# Benefits of Refactorings
(just browse the commits to get the different stages)

## Simple Factory: ([doc](./documentation/SimpleFactory.md))
- separated what varies (pizza creation) from what stays the same (making the pizza)
- PizzaStore has no dependencies to concrete Pizzas anymore
- Tests don't require the PizzaStore to work with a certain Pizza (or all of them)
- Tests can inject stubs easily to test PizzaStores logic
- PizzaStore now follows the Open-Closed principle

## Factory Method: ([doc](./documentation/FactoryMethod.md))
- separate usage and implementation of the product
- ensure that same logic is applied to all products (dev doesn't need to remember)
- logic and product instantiation can still be tested separately


## Abstract Factory: ([doc](./documentation/AbstractFactory.md))
- define creation of families of related or dependent products
- decouple logic from actual factories (easy replacement of factories)
- decouple logic applied on objects from their instantiation (same logic applied on all products)
