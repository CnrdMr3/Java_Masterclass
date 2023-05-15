public class MethodStructureWithParametersAndReturnType {

	/*
	>>> Example:
		public static int calculateMyAge( int dateOf Birth ) {
			return (2023 - dateOfBirth);
		}

	> This method will return an integer when it finishes executing successfully.
	 */
	public static void main(String[] args) {

		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;

		int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println("High Score: " + highScore);

		score = 10_000;
		levelCompleted = 8;
		bonus = 200;

		System.out.println("The next highScore: " +
			calculateScore(gameOver, score, levelCompleted, bonus));
	}

	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

		int finalScore = score;

		if (gameOver) {
			finalScore += (levelCompleted * bonus);
			finalScore += 1000;

		}
		return finalScore;
	}
}
