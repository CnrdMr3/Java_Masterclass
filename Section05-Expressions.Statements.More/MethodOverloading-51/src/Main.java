public class Main {
	public static void main(String[] args) {

		System.out.println("New score is: " + calculateScore("Quinn ", 500));
		System.out.println("New score is: " + calculateScore(10));
	}

	public static int calculateScore(String playerName, int score) {

		System.out.println("Player " + playerName + " score" + score + " points");
		return score * 1000;
	}

	public static int calculateScore(int score) {
		return calculateScore("Anonymous Ghost", score);
	}

	public static int calculateScore() {

		System.out.println("Player's name is John Doe.");
		return 0;
	}
}