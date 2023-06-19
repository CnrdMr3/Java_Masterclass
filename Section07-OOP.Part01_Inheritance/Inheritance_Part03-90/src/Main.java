public class Main {
	public static void main(String[] args) {

		Animal animal = new Animal("Generic Animal", "Huge",400.0 );
		doAnimalStuff(animal,"slow");

		Dog dog = new Dog();
		doAnimalStuff(dog,"fast");

		Dog terrier = new Dog("Jack-Russell", 10.0);
		doAnimalStuff(terrier, "fast");
		Dog retriever = new Dog("Labrador", 29.15, "Floppy", "Swimmer");
		doAnimalStuff(retriever, "slow");

		Dog wolf = new Dog("Wolf", 40.0);
		doAnimalStuff(wolf, "fast");

		Fish goldie = new Fish("Goldfish", 0.15, 2, 3);
		doAnimalStuff(goldie, "fast");
	}

	public static void doAnimalStuff(Animal animal, String speed) {

		animal.makeNoise();
		animal.move(speed);
		System.out.println(animal);
		System.out.println("_ _ _ _");
	}
}