public class Main {
	public static void main(String[] args) {
		Person person = new Person();
		person.setFirstName("Conrad");
		person.setLastName("Maré");
		person.setAge(34);

		System.out.println("First Name: " + person.getFirstName());
		System.out.println("Last Name: " + person.getLastName());
		System.out.println("Age: " + person.getAge());
		System.out.println("Is Teen? " + person.isTeen());
		System.out.println("Full Name: " + person.getFullName());
	}
}