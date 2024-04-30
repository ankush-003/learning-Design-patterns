# Structural Design Patterns
Structural design patterns are concerned with how classes and objects can be composed, to form larger structures. The structural design patterns simplifies the structure by identifying the relationships.

## Types of Structural Design Patterns
- **`Adapter`**: Allows objects with incompatible interfaces to collaborate.
- **`Facade`**: Provides a simplified interface to a complex system.
- **`Proxy`**: Provides a placeholder for another object to control access, reduce cost, and reduce complexity.
- **`Flyweight`**: Minimizes memory usage or computational expenses by sharing as much as possible with related objects.

## [Adapter Pattern](https://refactoring.guru/design-patterns/adapter)
![image](https://github.com/ankush-003/learning-Design-patterns/assets/94037471/eaa0d24d-b387-4821-9e37-0eb0dd70cfae)

Adapter pattern works as a bridge between two incompatible interfaces. This type of design pattern comes under structural pattern as this pattern combines the capability of two independent interfaces.

[two ways](https://www.baeldung.com/java-adapter-pattern) to implement the adapter pattern:
- `Class Adapter Pattern`: This form uses multiple inheritance to adapt one interface to another.
- `Object Adapter Pattern`: This form uses object composition to contain the interface that needs adapting.

## [Facade Pattern](https://refactoring.guru/design-patterns/facade)
![image](https://github.com/ankush-003/learning-Design-patterns/assets/94037471/b9201368-9fac-45d6-9bb9-5345417d39cc)

Facade pattern hides the complexities of the system and provides an interface to the client using which the client can access the system. This type of design pattern comes under structural pattern as this pattern adds an interface to existing systems to hide its complexities.

## [Proxy Pattern](https://refactoring.guru/design-patterns/proxy)
![image](https://github.com/ankush-003/learning-Design-patterns/assets/94037471/c8ee85c0-ce00-487d-8c3c-0743ccae6c7f)

Proxy pattern provides a surrogate or placeholder for another object to control access to it. This type of design pattern comes under structural pattern.
It Helps in implementing lazy loading, access control, logging, etc. Few types of proxies are:
- `Virtual Proxy`: It creates expensive objects on demand.
- `Protection Proxy`: It adds access control to the original object.
- `Remote Proxy`: It provides a local representation for an object that is in a different address space.
- `Cache Proxy`: It adds caching functionality to the original object.

## [Flyweight Pattern](https://refactoring.guru/design-patterns/flyweight)
![image](https://github.com/ankush-003/learning-Design-patterns/assets/94037471/b857185b-0b8c-4a50-b27c-d65ce64282d8)

Flyweight pattern is primarily used to reduce the number of objects created, to decrease memory footprint and increase performance. This type of design pattern comes under structural pattern as this pattern provides ways to decrease object count thus improving the object structure of application.
