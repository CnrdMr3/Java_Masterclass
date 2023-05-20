public class Main {

	public static void main(String[] args) {

		char charValue = 'X';
		switch (charValue) {
			case 'A':
				System.out.println("A is alpha");
				break;
			case 'B':
				System.out.println("B is bravo");
				break;
			case 'C':
				System.out.println("C is charlie");
				break;
			case 'D':
				System.out.println("D is delta");
				break;
			case 'E':
				System.out.println("E is echo");
				break;
			default:
				System.out.println("Letter 'x-ray' " + charValue + " was not found in the switch");
				break;
		}
	}
}
