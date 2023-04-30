public class MainChallenge2 {
	public static void main(String[] args) {

		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;

		int finalScore = score;
		if (gameOver) {
			System.out.println("Your score is " + finalScore);
		}

		boolean newGameOver = true;
		int newScore = 10_000;
		int newLevelCompleted = 5;
		int newBonus = 100;

		int newFinalScore = score;

		if (newGameOver == true) {
			newFinalScore += (newLevelCompleted * newBonus);
			System.out.println("Your final score was " + newFinalScore);
		}
	}
}
