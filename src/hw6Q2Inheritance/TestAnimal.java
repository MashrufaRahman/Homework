package hw6Q2Inheritance;

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
