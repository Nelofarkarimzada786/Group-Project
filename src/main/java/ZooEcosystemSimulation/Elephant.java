package ZooEcosystemSimulation;

public class Elephant extends Mammal {

   private double trunkLength;

   public Elephant(String name, int age, String furColor, double trunkLength)
   {
       super(name, age, furColor);
       this.trunkLength = trunkLength;
   }


   @Override
    public void eat()
   {
       System.out.println(name+ " the elephant is eating leaves and fruits.");
   }

   @Override
    public void makeSound()
   {
       System.out.println(name+ " trumpets with its trunk!");
   }

   @Override
    public void displayInformation()
   {
       super.displayInformation();
       System.out.println("Species: Elephant");
       System.out.println("Trunk Length: " + trunkLength + "meters");
   }

}
