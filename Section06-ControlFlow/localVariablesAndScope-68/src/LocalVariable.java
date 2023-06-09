public class LocalVariable {

	/*
	A local variable is called a local, because it is available by the code block in which it was declared.

	It is available by the code block in which it was declared.
	 */

	// Example:
	public static void main(String[] args) {
		// Starts an outer block - for example a method block.
		int firstVariable = 5;
		int secondVariable = 10;

		if (firstVariable > 0) {    // flow statement block starts inner block

			// Inner block code block has access to outer block's variables
			System.out.println(secondVariable);
		}
	}
}