public class Main {
	public static void main(String[] args) {

		Dog rex = new Dog("rex");
		Dog fluffy = new Dog("fluffy");
		rex.printName(); // prints 'rex'
		fluffy.printName(); // prints 'fluffy'

		// prints different names due to the variable NOT being static.
	}
}