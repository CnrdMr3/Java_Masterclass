public class ReadingUserInput {

	public static void main(String[] args) {

		int currentYear = 2023;
		String usersDateOfBirth = "1989";

		int dateOfBirth = Integer.parseInt(usersDateOfBirth);

		System.out.println("Age = " + (currentYear - dateOfBirth));

		String usersAgeWithPartialYear = "22.5";
		double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
		System.out.println("User says he is = " + ageWithPartialYear);
	}
}