public class Main {
	public static void main(String[] args) {
		SimpleCalculator calculator = new SimpleCalculator();
		calculator.setFirstNumber(10.5);
		calculator.setSecondNumber(5.2);

		double additionResult = calculator.getAdditionResult();
		double subtractionResult = calculator.getSubtractionResult();
		double multiplicationResult = calculator.getMultiplicationResult();
		double divisionResult = calculator.getDivisionResult();

		System.out.println("Addition result: " + additionResult);
		System.out.println("Subtraction result: " + subtractionResult);
		System.out.println("Multiplication result: " + multiplicationResult);
		System.out.println("Division result: " + divisionResult);
	}
}