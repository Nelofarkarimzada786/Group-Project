package ZooEcosystemSimulation;

public abstract class Bird extends Animal {
    protected double wingspan;

    public Bird(String name, int age, double wingspan)
    {
        super(name, age);
        this.wingspan = wingspan;
    }


    //@Override
    public void displayInformation()
    {
        System.out.println("Type: Bird");
        System.out.println("Name: " + name);
        System.out.println("age: " + age + " years");
        System.out.println("Wingspan: " + wingspan + " cm");
    }

    public void fly() {
        System.out.println(name+ " is flying with a wingspan of " + wingspan + " cm");
    }
}
