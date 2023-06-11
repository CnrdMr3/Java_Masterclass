public class InputFromSystemConsole {
	public static void main(String[] args) {

		int currentYear = 2023;

		System.out.println(getInputFromConsole(currentYear));
	}

	public static String getInputFromConsole(int currentYear) {

		String name = System.console().readLine("Howzit, What's your name? ");
		System.out.println("Hi " + name + ", laat hy loop soos 'n (Sn)Cortina op 'n nat-pad kwagga!");

		return " ";
	}
}
