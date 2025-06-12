**Task: Zoo Ecosystem Simulation:**

**Overview:** Design a software simulation for a zoo ecosystem. 
The simulation will focus on different types of animals, their behaviors, 
and how they interact with their environment. This task will involve creating 
a hierarchy of animal classes, implementing interfaces for animal behaviors, 
and utilizing abstract classes and methods to define common traits and actions.

Part 1: Defining the Base Structure
-
Interface AnimalBehavior: Defines methods eat(), sleep(), and makeSound().
These methods represent common actions that all animals in the zoo might perform,
but the specifics of these actions will vary depending on the animal type.
-
Abstract Class Animal: Implements AnimalBehavior. This class serves as the base for all animal types, providing implementation for some methods of AnimalBehavior that are common across all animals, 
such as sleep(), and defining abstract methods like displayInformation() to show 
details about the animal.

Part 2: Creating Specific Animal Classes
-
Class Mammal and Bird: Extend the Animal class. These classes will override the eat(), makeSound(), and displayInformation() methods to provide specific behaviors and information display mechanisms for mammals and birds, respectively.
-
**Further Specialization:** Within the Mammal and Bird classes, create specific animals,
such as Lion, Elephant (Mammals), and Parrot, Eagle (Birds). These specific animal 
classes will override the methods from their parent classes to provide behaviors 
and sounds unique to each animal.


Part 3: Implementing Features Using OOP Concepts
-

**Inheritance**: Demonstrated by the class hierarchy starting from Animal to Mammal/Bird to specific animals like Lion, Elephant, etc.
-
**Polymorphism and Method Overriding:** Specific animal classes overriding behavior methods like eat(), makeSound(), and displayInformation().
-
**Abstraction:** The Animal class is abstract, containing both implemented and abstract methods, enforcing a contract for the subclasses.
-
**Interface Implementation:** All animals implement the AnimalBehavior interface, ensuring that they all provide implementations for the methods defined in the interface.
-
**Constructors:** Use in specific animal classes to initialize properties like name, age, or any unique attributes they have.
-
