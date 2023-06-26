public class Main {

	public static void main(String[] args) {

		Employee tim = new Employee("Tim", "01/01/2000", "01/01/2020");
		System.out.println(tim);
		System.out.println("Age = " + tim.getAge());
		System.out.println("Pay = " + tim.collectPay());

		SalariedEmployee joe = new SalariedEmployee("Joe", "02/02/2002", "02/02/2022",35000);
		System.out.println(joe);
		System.out.println("Joe's pay-check = $: " + joe.collectPay());

		joe.retire();
		System.out.println("Joe's pay-check = $: " + joe.collectPay());

		HourlyEmployee mary = new HourlyEmployee("Mary", "03/03/2003", "03/03/2023", 15);
		System.out.println(mary);
		System.out.println("Mary's pay-check = $: " + mary.collectPay());
		System.out.println("Mary's holiday pay = $:" + mary.getDoublePay());
	}
}