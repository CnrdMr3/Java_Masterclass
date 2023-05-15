public class MethodChallengeImprovedCode2 {
	public static void main(String[] args) {

		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Coenster", highScorePosition);

		highScorePosition = calculateHighScorePosition(1000);
		displayHighScorePosition("Tian", highScorePosition);

		highScorePosition = calculateHighScorePosition(500);
		displayHighScorePosition("Oos", highScorePosition);

		highScorePosition = calculateHighScorePosition(100);
		displayHighScorePosition("Erik", highScorePosition);

		highScorePosition = calculateHighScorePosition(25);
		displayHighScorePosition("Gustav", highScorePosition);
	}

	public static void displayHighScorePosition(String playerName, int highScorePosition) {
		System.out.println(playerName + " managed to get into position "
				+ highScorePosition + " on the high score list");
	}

	public static int calculateHighScorePosition(int playerScore) {
		// Code block has been improved here, but now return is changed to position:
		int position = 4;
		if (playerScore >= 1000) {
			position = 1;
		} else if (playerScore >= 500) {
			position = 2;
		} else if (playerScore >= 100) {
			position = 3;
		}
		return position;
	}
}
