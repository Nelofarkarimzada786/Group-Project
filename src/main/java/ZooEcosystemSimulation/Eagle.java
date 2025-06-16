package ZooEcosystemSimulation;

public class Eagle extends Bird {

    private double flyingSpeed;

    public Eagle(String name, int age, double wingspan, double flyingSpeed)
    {
        super(name, age, wingspan);
        this.flyingSpeed = flyingSpeed;
    }

    @Override
    public void eat()
    {
        System.out.println(name+ " the eagle is hunting for prey.");
    }

    @Override
    public void makeSound()
    {
        System.out.println(name+ " screeches high in the sky!");
    }


    @Override
    public void displayInformation()
    {
        super.displayInforamtion();
        System.out.println("Species: Eagle");
        System.out.println("Flying Speed " + flyingSpeed + " km/h");
    }

}
