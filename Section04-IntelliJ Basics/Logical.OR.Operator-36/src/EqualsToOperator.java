public class EqualsToOperator {
	public static void main(String[] args) {
		// boolean,unlike a value,doesn't compare numbers but words. => " isCar = true " is the same as
		// " isCar == true ".
		boolean isCar = false;
		if (isCar == true) {
			System.out.println("This is not supposed to happen!");
			// " if (isCar) { etc.} " is shorthand for the above statement.

			boolean isCar1 = false;
			if (!isCar1) {
				System.out.println("This is shorthand!");
				// 	" (!isCar1) " means the same as " (isCar1 != true) "
			}
		}
	}
}