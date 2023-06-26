public class Main {

	public static void main(String[] args) {

		Employee tim = new Employee("Tim", "01/01/2000", "01/01/2020");
		System.out.println(tim);
		System.out.println("Age = " + tim.getAge());
		System.out.println("Pay = " + tim.collectPay());

		Employee joe = new Employee("Joe", "02/02/2002", "02/02/2022");
		System.out.println(joe);
	}
}