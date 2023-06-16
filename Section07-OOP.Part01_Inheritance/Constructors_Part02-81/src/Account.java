public class Account {
	private String number;
	private double balance;
	private String customerName;
	private String customerEmail;
	private String customerPhone;

	// Calling a Constructor within a Constructor: ( Constructor Chaining )
	public Account() {
		// 'this' constructor has to be called before System.out.println():
		this("456456", 2.50, "Default name", "Default address",
				"Default phone");
		System.out.println("Empty constructor called.");
	}

	public Account(String number, double balance, String customerName, String email, String phone) {
		System.out.println("Account constructor called with parameters");
		this.number = number;
		this.balance = balance;
		this.customerName = customerName;
		customerEmail = email;
		customerPhone = phone;
	}

	public Account(String customerName, String customerEmail, String customerPhone) {
		this("99999", 100.55, customerName, customerEmail, customerPhone);
//		this.customerName = customerName;
//		this.customerEmail = customerEmail;
//		this.customerPhone = customerPhone;
	}

	public void depositFunds(double depositAmount) {

		balance += depositAmount;
		System.out.println("Deposit of $" + depositAmount + " made. New balance: $" + this.balance);
	}

	public void withdrawFunds(double withdrawAmount) {
		if (balance - withdrawAmount < 0) {
			System.out.println("Insufficient funds. Balance: $" + this.balance + " in your account.");
		} else {
			balance -= withdrawAmount;
			System.out.println("Withdrawing: $" + withdrawAmount + " made. Balance:$" + balance);
		}
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return this.customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPhone() {
		return this.customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
}
