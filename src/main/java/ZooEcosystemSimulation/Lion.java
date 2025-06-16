package ZooEcosystemSimulation;

public class Lion extends Mammal {

    public Lion(String name, int age, String furColor)
    {
        super(name, age, furColor);
    }

    @Override
    public void eat()
    {
        System.out.println(name + " the lion is eating meat");
    }

    @Override
    public void makeSound()
    {
        System.out.println(name+ " roars loudly!");
    }

    @Override
    public void displayInformation()
    {
        super.displayInformation();
        System.out.println("Species: Lion");
    }
}
