public class Main {
	public static void main(String[] args) {
		double firstDoubleValue = 20.00d;
		double secondDoubleValue = 80.00d;
		double addedValues = ((firstDoubleValue + secondDoubleValue) * 100.00d);
		System.out.println("The added values = " + addedValues);

		double theRemainder = addedValues % 40.00d;
		System.out.println("The remainder values = " + theRemainder);

		boolean isNoRemainder = (theRemainder == 0) ? true : false;
		System.out.println("isNoRemainder = " + isNoRemainder);

		if (!isNoRemainder) {
			System.out.println("Got a remainder");
		}
	}
}