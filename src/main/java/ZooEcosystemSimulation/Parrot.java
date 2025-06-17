package ZooEcosystemSimulation;

public class Parrot extends Bird{

    private final String featherColor;
    public Parrot(String name, int age, double wingspan, String featherColor)
    {
        super(name, age, wingspan);
        this.featherColor = featherColor;
    }

    @Override
    public void eat()
    {
        System.out.println(name+ " the parrot is eating seeds and fruits.");
    }

    @Override
    public void makeSound()
    {
        System.out.println(name+ " says 'Polly wants a cracker!");
    }


    @Override
    public void displayInformation()
    {
        super.displayInformation();
        System.out.println("Species: Parrot");
        System.out.println("Feather Color: " + featherColor);
    }

}
