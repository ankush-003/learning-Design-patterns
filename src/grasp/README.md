# GRASP Patterns
- [GRASP Patterns](#grasp-patterns)
  - [Creator](##creator)
  - [Information Expert](#information-expert)
  - [Low Coupling](#low-coupling)
  - [High Cohesion](#high-cohesion)
  - [Controller](#controller)
  - [Polymorphism](#polymorphism)
  - [Pure Fabrication](#pure-fabrication)
  - [Indirection](#indirection)
  - [Protected Variations](#protected-variations)
  - [Summary](#summary)

## Creator
- Assign class B the responsibility to create an instance of class A if one of these is true:
  - B aggregates A objects
  - B contains A objects
  - B records instances of A objects
  - B closely uses A objects
- Example: A `Person` class should not be responsible for creating a `Person` object. Instead, a `PersonFactory` class should be responsible for creating a `Person` object.

## Information Expert
- Assign a responsibility to the class that has the information needed to fulfill it.
- Example: A `Person` class should be responsible for calculating the age of a `Person` object.
- Increases cohesion (the degree to which the elements inside a module belong together).

## Low Coupling
- Reduce the dependencies between classes.
- levels of coupling(low to high):
  - Dependence: class depends on another class, but is not part of it.
  - Association: class contains a reference to another class.
  - Composition: class contains another class (differs from association in that the contained class has no meaning without the container class).
  - Inheritance: class is a subclass of another class, implements or extends another class.

## High Cohesion
- Increase the cohesion of a class by assigning responsibilities that are closely related.
- Classes should have a single responsibility.

## Controller
- Assign the responsibility for handling a system event to a class representing the system or a subsystem.

## Polymorphism
- Assign a responsibility to a class that can be implemented by multiple classes.
- Dynamically handle different types of similar objects.
- Example: A `Shape` class can have a `draw` method that is implemented by `Circle`, `Rectangle`, and `Triangle` classes.

## Pure Fabrication
- Assign a responsibility to a class that does not represent a concept in the problem domain.
- It is a class that is created to handle a responsibility that does not fit into any other class.
- Example `SalaryCalculator` class that calculates the salary of a `Person` object, rather than having the `Person` class calculate its own salary.

## Indirection
- Assign a responsibility to an intermediate object to mediate between other components or services.

## Protected Variations
- Identify points of predicted variation in the system and assign responsibilities to create a stable interface around them.


## References

- [GRASP Patterns in OOAD](https://www.geeksforgeeks.org/grasp-design-principles-in-ooad/)
- [Derek Banas - GRASP Design Patterns](https://youtu.be/9Y2mZger8kE?si=GH9ufrVejfNlBp4d)