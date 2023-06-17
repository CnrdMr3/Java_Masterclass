public class Main {
	public static void main(String[] args) {

		Dog rex = new Dog("rex"); // create instance (rex)
		Dog fluffy = new Dog("fluffy"); // create instance (fluffy)
		rex.printName(); // print fluffy
		fluffy.printName(); // print fluffy

		// 'fluffy' is printed twice because of the STATIC VARIABLE being shared between instances.
	}
}