public class Main {
	public static void main(String[] args) {

		for (int i = 0; i <= 5; i++) {
			Student s = new Student("S00001" + i,
					switch (i) {
				case 1 -> "Joey";
				case 2 -> "Johnny";
				case 3 -> "Dee-Dee";
				case 4 -> "Marky";
				case 5 -> "Ramona";
				default -> "The Ramones";
					},
					"01/01/1967",
					"Radio Rock 'n Roll");

			System.out.println(s);
		}
	}
}