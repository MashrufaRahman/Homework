package hw6Q2Inheritance;

/*
 * Now extends BullDog, Cobra, and Robin class to their parents class and shows their hierarchy till Animal Class, for example: bulldog -- dog -- mammal --Animal, Cobra -- snake--reptile--Animal, Robin -- Bird -- Animal etc. We know, An object Can call other methods if the class is extended, if yes, show all the possible calls. Use Java comments to show single inheritance, multiple inheritance, Hierarchical inheritance by example form the above. Also, show by java comments who is Parent class and who is child class for at least one class. Organize the code. Push the code in Github. Paste your github link below.
 */

public class TestAnimal {
	public static void main(String[] args) {
		System.out.println("******calling the animal class*******");
		Animal animal = new Animal();
		animal.animalInfo();

		// Single inheritance
		System.out.println("****calling the mammal class****");
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();

		// Single inheritance
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();

		// Single inheritance
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();

		// Multilevel inheritance
		System.out.println("*****calling the dog class**********");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();

		// Multilevel inheritance
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();

		// Single inheritance
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();

		// Multilevel inheritance
		System.out.println("********calling the bullDog class*****");
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();

		// Multilevel inheritance
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();

	}

}
