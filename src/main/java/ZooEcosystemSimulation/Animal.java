package ZooEcosystemSimulation;

public abstract class Animal implements AnimalBehavior {

    protected String name;
    protected int age;

    public Animal(String name, int age)
    {
      this.name = name;
      this.age = age;
    }

    //implementation for sleep behavior
    @Override
    public void sleep()
    {
        System.out.println(name +  " is sleeping peacefully.");
    }


    //Abstract methods to be implemented by subclasses
    @Override
    public abstract void eat();


    @Override
    public abstract void makeSound();


    //Display information for animal

    public abstract void displayInformation();
}
