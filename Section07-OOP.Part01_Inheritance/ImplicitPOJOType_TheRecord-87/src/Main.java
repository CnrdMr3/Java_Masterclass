public class Main {
	public static void main(String[] args) {

		for (int i = 0; i <= 5; i++) {
			LPAStudent s = new LPAStudent("S00001" + i,
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

		Student pojoStudent = new Student ("S123456", "Ann",
				"01/01/2000", "Java Masterclass");
		LPAStudent recordStudent = new LPAStudent("S321654", "Bill",
				"02/01/2002", "Java Masterclass");

		System.out.println(pojoStudent);
		System.out.println(recordStudent);

		pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
//		recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829");

		System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
		System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
	}
}