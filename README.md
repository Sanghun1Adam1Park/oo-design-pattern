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
### Single Responsibility Principle

### Open Closed Principle

### Liskov's Substitution Principle

### Interface Segregation Principle

### Dependency Inversion Principle
