# SOLID Principles
SOLID is an acronym for the first five object-oriented design (OOD) principles by Robert C. Martin. These principles are a set of guidelines that help software developers design maintainable and scalable software.

The five SOLID principles are:
- **`Single Responsibility Principle (SRP)`**
- **`Open/Closed Principle (OCP)`**
- **`Liskov Substitution Principle (LSP)`**
- **`Interface Segregation Principle (ISP)`**
- **`Dependency Inversion Principle (DIP)`**

## Single Responsibility Principle (SRP)
The Single Responsibility Principle states that a class should have only one reason to change, meaning that a class should have only one job or responsibility.
- A class should have only one reason to change.
- A class should have only one responsibility.

## Open/Closed Principle (OCP)
The Open/Closed Principle states that a class should be open for extension but closed for modification.
- A class should be open for extension but closed for modification.
- A class should be easily extendable without modifying the class itself.

## Liskov Substitution Principle (LSP)
The Liskov Substitution Principle states that objects of a superclass should be replaceable with objects of its subclasses without affecting the functionality of the program.
- This can be achieved by using composition and interfaces.

## Interface Segregation Principle (ISP)
The Interface Segregation Principle states that a client should not be forced to implement an interface that it does not use, many small, client-specific interfaces are better than one general-purpose interface.

## Dependency Inversion Principle (DIP)

The Dependency Inversion Principle states that high-level modules should not depend on low-level modules, both should depend on abstractions. Abstractions should not depend on details, details should depend on abstractions.

- High-level modules should not depend on low-level modules.
- Combonation of the Single Responsibility Principle and the Open/Closed Principle.
