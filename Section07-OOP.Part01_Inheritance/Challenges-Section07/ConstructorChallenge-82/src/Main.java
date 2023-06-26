public class Main {
	public static void main(String[] args) {

		Customer customer = new Customer("Peter", 1000.00, "PeterIanStaker@lol.com");
		System.out.println(customer.getName());
		System.out.println(customer.getCreditLimit());
		System.out.println(customer.getEmailAddress());

		Customer secondCustomer = new Customer();
		System.out.println(secondCustomer.getName());
		System.out.println(secondCustomer.getCreditLimit());
		System.out.println(secondCustomer.getEmailAddress());

		Customer thirdCustomer = new Customer("John Doe", "joedough@kiffness.com");
		System.out.println(thirdCustomer.getName());
		System.out.println(thirdCustomer.getCreditLimit());
		System.out.println(thirdCustomer.getEmailAddress());
	}
}