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


**Solutions**

1. create AnimalBehavior interface which defines common behaviors that all animals should have 
--methods we must declare inside this interface are:  

      eat(): how the animal eats 
      sleep(): how tha animal sleeps 
      makeSound(): The sound the animal makes

2. Create Animal abstract class which will be base class for all animals providing common functionality
--parts we must declare inside this class are: 
    --fields: **name** and **age**(protected so subclass can access)  
    --Constructor: initializes **name** and **age** 
    --Concrete sleep() method (default implementation)
    --Abstract methods that subclasses must implement

3. Create Mammal class which will be base class for all mammals 
--parts we must declare inside this class are: 
    --field: furColor 
    --Implements displayInformation() for mammals
    --Constructor chains to animal's constructor

4. create Bird abstract class which will be the base class for all birds 
   --parts we must declare inside this class are:
   --field: wingspan
   --Implements displayInformation() for birds
   --Fly() method (unique to birds)

5. Create Lion class which will be concrete lion implementation and this class will extend from Mammal class 
   --parts we must declare inside this class are:
   --eat() with lion-specific behavior
   --makeSound() with lion roar 
   --displayInformation() adds species info

6. Create Elephant class which will be concrete elephant implementation  and extends from Mammal class
   --parts we must declare inside this class are:
   --field: trunkLength
   --Implements elephant-specific behaviors 
   --Displays additional trunk length information 

7. Create Parrot Class  which will be concrete parrot implementation and extends form Bird class
   --parts we must declare inside this class are:
   --field:featherColor  
   --Implements parrot-Specific behaviors 
   --Display additional feather color information

8. Create eagle class which will be concrete eagle implementation 
   --parts we must declare inside this class are:
   --field: flyingSpeed
   --Implements eagle-specific behaviors 
   --Displays additional flying speed information 

9. Create ZooSimulation Class (Main) which will do the following: 
    --create instances of different animals
    --Stores them in an Animal array
    --Iterated through each animal:         
        *Display header with name
        *shows animal information
        *Makes animal eat, make sound and sleep
        *Display header with name 
        *If animal is a Bird make it fly(demonstrates polymorphism)