public class Main {
	public static void main(String[] args) {

		System.out.println("5ft, 8in = " + convertToCentimeteters(5, 8) + "cm");
		System.out.println("68in = " + convertToCentimeteters(68) + "cm");
	}

	public static double convertToCentimeteters(int inches) {

		return inches * 2.54;
	}

	public static double convertToCentimeteters(int feet, int inches) {

		// return convertToCentimeteters((feet * 12) + inches);
		int feetToInches = feet * 12;
		int totalInches = feetToInches + inches;
		double result = convertToCentimeteters(totalInches);
		return result;
	}
}