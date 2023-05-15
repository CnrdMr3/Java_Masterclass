public class MoreOnMethods {

	public static void main(String[] args) {

		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;

		calculateScore(gameOver, score, levelCompleted, bonus);

		score = 10_000;
		levelCompleted = 8;
		bonus = 200;

		calculateScore(gameOver, score, levelCompleted, bonus);
	}

	public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

		int finalScore = score;

		if (gameOver) {
			finalScore += (levelCompleted * bonus);
			finalScore += 1000;
			System.out.println("Your final score was " + finalScore);
		}
	}
}
