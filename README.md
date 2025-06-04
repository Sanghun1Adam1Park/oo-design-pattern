# Object-Oriented Programming Design Principle and Patterns.
This repository showcases practical implementations of core design pattern concepts.
Its purpose is to help me reflect on and recall these fundamental principles.

## 4 Main concepts of Object-Oriented Programming 

### Abstraction
Hiding complex implementation details and showing only the essential features of an object.
- Focusing on what an object does rather how it does 
- Reduces complexity 
- Increases code readability 
- Achieved using (in Java)
  - Abstract class or
  - Interface 

### Encapsulation
Bundling data (variables) and methods (functions) that operate on that user or change that data (variables) together in one unit.
It also means to protect some parts of that unit so they can't be accessed or changed directly externally.
- hiding the internal state (current values of variables) of an object and only exposing a controlled interface (getter/setter) to interact with it.
- Protects the data 
- Improves maintainability 
- Improved code control 
  - You can control the behavior of code better

### Inheritance 
Allowing class to inherit variables and methods from other classes.
- Lets you reuse code from an existing class to create a new, more specific class.
- Decreases code duplication
- Enables extensibility
- Improve modularity 
- Support polymorphism 

### Polymorphism 
Allows objects of different class to be treated as objects of a common superclass.
- Enables a single interface to represent different underlying forms.
- Two main types 
  - Compile-time
    - Methods can have the same name if they differ in parameter type, number, or order.
  - Run-time 
    - A method defined in the superclass can be overridden by a subclass to provide specific behavior.
- Promotes code reuse
- Enables extensibility 
- Improves maintainability and scalability

## SOLID Design Principle
A set of guidelines that helps us to avoid a bad design when designing and developing software.

### Three important characteristics of a bad design that should be avoided.
#### Rigidity
It is hard to change because every change effects too many other parts of the system.
#### Fragility
When you make a change, unexpected parts of the system break.
#### Immobility
It is hard to reuse in other application because it cannot be disentangled from the current application.

### Single Responsibility Principle
A class should have only one reason to change. In other words, it should have only one responsibility/job.
(e.g. Reading data and parsing should be done by separate classes.)

### Open Closed Principle
Software entities like classes, modules, and functions should be open for extension but closed for modifications.
In other words, you should design software entities in a way that if you want to extend it, it should be so that you 
do not modify anything that is already implemented and working.

### Liskov's Substitution Principle
Derived types must be completely substitutable for their base types. In other words,
the new derived classes should be able to replace base classes without any change in the
program, so make sure to design derived class is interchangeable with base class
within the system/program.

### Interface Segregation Principle
Clients should not be forced to depend upon interfaces that they don't use.
It is simply *SRP* at interface level, to well define and distribute responsibilities/jobs
at interface level so that clients should not have to deal with unnecessary implementation.

### Dependency Inversion Principle
High-level modules should not depend on low-level modules. Both should depend on abstractions.
Abstractions should not depend on details. Details should depend on abstractions. 

- **High-level modules**: Contain business rules or application logic (e.g., `OrderService`, `UserManager`).
- **Low-level modules**: Handle technical details like data access, networking, file I/O (e.g., `MySQLDatabase`, 
`EmailSender`).

In other words, high-level modules should not depend directly on low-level modules.  
Instead, both should depend on a common abstraction (such as an interface or an abstract class).

This abstraction defines a contract that low-level modules implement and high-level modules rely on.  
This way, high-level logic can interact with low-level details without knowing how they are implemented.