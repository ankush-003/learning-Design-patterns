# Creational Design Patterns
 The creational design patterns deal with object creation mechanisms, trying to create objects in a manner suitable to the situation. The basic form of object creation could result in design problems or added complexity to the design. Creational design patterns solve this problem by controlling the object creation process.
 
The creational design patterns are:
- **`Singleton`**
- **`Builder`**
- **`Prototype`**
- **`Factory Method`**
- **`Abstract Factory`**

## [Singleton Pattern](https://refactoring.guru/design-patterns/singleton)
![image](https://github.com/ankush-003/learning-Design-patterns/assets/94037471/9565835e-25aa-46de-a6b3-1e9ef4a67c03)

The Singleton pattern ensures that a class has only one instance and provides a global point of access to that instance. It is useful when you need to control object creation, limiting the number of objects to only one. The pattern is commonly used for logging, driver objects, caching, thread pools, and database connections.

All implementations of the Singleton have these two steps in common:

- Make the default constructor private, to prevent other objects from using the new operator with the Singleton class.
- Create a static creation method that acts as a constructor. Under the hood, this method calls the private constructor to create an object and saves it in a static field. All following calls to this method return the cached object.


[Making a singleton class thread-safe](https://refactoring.guru/design-patterns/singleton/java/example#example-2) is a bit tricky. The easiest way to create a thread-safe singleton class is to make the global access method synchronized, so that only one thread can execute this method at a time.

- Use `synchronized` keyword to make getInstance() method thread-safe.
- Use `volatile` keyword to make singleton instance visible to all threads. (volatile keyword ensures that multiple threads offer the singleton instance variable correctly when it is being initialized to Singleton instance.)
- Use `double-checked locking` to reduce the use of synchronization in getInstance() method.
- Use a local variable to store the singleton instance and return that local variable instead of returning the instance variable directly to reduce the number of accesses to the volatile instance variable.

## [Factory Pattern](https://refactoring.guru/design-patterns/factory-method)

![image](https://github.com/ankush-003/learning-Design-patterns/assets/94037471/28ea5b1c-3efb-4740-b2cf-c1159cc690ab)


The Factory Method pattern provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created. It defines a method that should be used for creating objects instead of direct constructor call (new operator). Subclasses can override this method to change the class of objects that will be created.

- The product classes are created by the factory method.
- The product class is an interface or an abstract class that defines the type of objects that the factory method creates.
- The concrete product classes are the classes that implement the product interface.
- Create an abstract class that defines the factory method.
- Create concrete classes that extend the abstract class and implement the factory method to create concrete product classes.

## [Abstract Factory Pattern](https://refactoring.guru/design-patterns/abstract-factory)

![image](https://github.com/ankush-003/learning-Design-patterns/assets/94037471/da860dc7-c3ab-4034-9cee-6ca9451f49cc)


The Abstract Factory pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes. It is a super-factory that creates other factories. The Abstract Factory pattern is also known as the Factory of Factories.

- Used when a single class (factory) cannot create all the objects. (Different lines of products)
- Explicitly declare interfaces for each distinct product of the product family.
- Create concrete classes that implement the interfaces to create concrete products.
- Create an abstract class that defines the factory method.
- Create concrete classes that extend the abstract class and implement the factory method to create concrete product classes.

## [Builder Pattern](https://refactoring.guru/design-patterns/builder)

![image](https://github.com/ankush-003/learning-Design-patterns/assets/94037471/d0b62fb3-8cd7-47e6-b2f5-6e6b6a39ffb5)


The Builder pattern is used to construct a complex object step by step. It provides a way to construct a complex object using simple objects and using a step-by-step approach. The construction process is independent of the main object creation process. The pattern is used when the construction of an object is complex and requires multiple steps.

- The constructor of the class should be package-private (if the builder is in the same package) or private (if the builder is an inner class).
- Director class is used to construct the object with similar steps.
- The builder class should have a method to set the properties of the object.
- We can use builder as interface if two objects have the same construction process and fields.

## [Prototype Pattern](https://refactoring.guru/design-patterns/prototype)

![image](https://github.com/ankush-003/learning-Design-patterns/assets/94037471/7ac9e182-b391-4094-9229-9048b6ec4322)


The Prototype pattern is used to create a new object by copying an existing object, known as the prototype. The prototype object is cloned to create a new object. The pattern is used when the creation of an object directly is costly. The prototype pattern provides a mechanism to copy the original object to a new object and then modify it according to our needs.

