public class Main {
	public static void main(String[] args) {

		Account bobsAccount = new Account();

		bobsAccount.setNumber("456456");
		bobsAccount.setBalance(1000.00);
		bobsAccount.setCustomerName("Bob Robertson");
		bobsAccount.setCustomerEmail("PeterIanStaker@fml.com");
		bobsAccount.setCustomerPhone("555-555-5555");

		bobsAccount.withdrawFunds(100.00);
		bobsAccount.depositFunds(250.00);
		bobsAccount.withdrawFunds(50);

		bobsAccount.withdrawFunds(200.00);

		bobsAccount.depositFunds(100.00);
		bobsAccount.withdrawFunds(45.64);
		bobsAccount.withdrawFunds(54.46);

		bobsAccount.withdrawFunds(54.36);
	}
}