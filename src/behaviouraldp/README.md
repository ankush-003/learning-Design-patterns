# Behavioural Design Patterns
Behavioural design patterns are design patterns that deal with the assignment of responsibilities between objects. They help in defining how objects interact in a loosely coupled way and can provide flexibility in carrying out communication.

## Types of Behavioural Design Patterns
- **`Chain of Responsibility`**: A way of passing a request between a chain of objects.
- **`Command`**: Encapsulate a command request as an object.
- **`Iterator`**: Sequentially access the elements of a collection.
- **`Interpreter`**: A way to include language elements in a program.

## [Chain of Responsibility](https://refactoring.guru/design-patterns/chain-of-responsibility)
![image](https://github.com/ankush-003/learning-Design-patterns/assets/94037471/693dc613-c482-4077-9dc6-2eb3b2f32f69)

The Chain of Responsibility pattern is used to achieve loose coupling in software design where a request from the client is passed to a chain of objects to process them. Each object in the chain will decide either to process the request or to pass it to the next object in the chain. The chain of objects will have a common interface to process the request and a reference to the next object in the chain to pass the request


## Command
![image](https://github.com/ankush-003/learning-Design-patterns/assets/94037471/62e5fd05-efae-4052-a6c8-ca3069df19cb)

The Command pattern is used to encapsulate a request as an object, thereby allowing for parameterization of clients with different requests, queuing of requests, and logging of requests. It also allows for the support of undoable operations.

- if we use inheritance to implement the command pattern, we will have to create a new class for each command. This can lead to a large number of classes in the system, also breaks the code if changes in the parent class are made.
- Inheritance to solve this problem may also lead to violation of single responsibility principle.

## Iterator
![image](https://github.com/ankush-003/learning-Design-patterns/assets/94037471/7935d115-2023-467a-9d90-ca78af8e6017)

The Iterator pattern is used to provide a standard way to traverse through a group of Objects. It provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation. The Iterator pattern is used when you want to access the elements of a collection without exposing its underlying representation.



## Interpreter
![image](https://github.com/ankush-003/learning-Design-patterns/assets/94037471/4333a659-eed5-4548-a9a7-623372b117b1)
