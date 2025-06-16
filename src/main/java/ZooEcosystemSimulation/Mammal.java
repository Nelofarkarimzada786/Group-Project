package ZooEcosystemSimulation;

public abstract class Mammal extends Animal{

    protected String furColor;

    public Mammal(String name, int age, String furColor)
    {
        super(name, age);
        this.furColor = furColor;
    }

    @Override
    public void displayInformation()
    {
        System.out.println("Type: Mammal");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Fur color: " + furColor);

    }

}