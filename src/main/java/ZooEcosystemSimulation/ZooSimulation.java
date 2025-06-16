package ZooEcosystemSimulation;

public class ZooSimulation {

    public static void main(String[] args) {

        //create animals

        Animal simba = new Lion("Simba", 5, "Golden");
        Animal dumbo = new Elephant("Dumbo", 10, "Gray", 2.5);
        Animal polly = new Parrot("Polly", 2, 30.0, "colorful");
        Animal sky = new Eagle ("Sky", 4, 180.0, 120.0);


        //Create an array of animals
        Animal[] animals = {simba, dumbo, polly, sky};

        for(Animal animal: animals)
        {
            System.out.println("\n-----" + animal.name + "-----");
            animal.displayInformation();
            animal.eat();
            animal.makeSound();
            animal.sleep();

            if(animal instanceof Bird)
            {
                ((Bird) animal).fly();
            }
        }
    }

}
