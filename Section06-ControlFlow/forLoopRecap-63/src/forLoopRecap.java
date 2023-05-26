public class forLoopRecap {
	public static void main(String[] args) {

		/*
		for (init; condition; increment) {
		// statements
		}
		>> semicolons are required!
		>> increment = known as iterator or iteration step
		>> curly braces to define loop code block (body)
		 */

		for (int number = 1; number < 7; number += 2) {
			System.out.println("number = " + number);
		}
	}
}