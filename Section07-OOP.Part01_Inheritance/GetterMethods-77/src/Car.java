public class Car {
	private String make = "Alfa-Romeo";
	private String model= "Spider";
	private String color = "White";
	private int doors = 2;
	private boolean convertible = true;

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public int getDoors() {
		return doors;
	}

	public boolean isConvertible() {
		return convertible;
	}

	public void describeCar() {

		System.out.println(doors + "-Door " +
				color + " " +
				make + " " +
				model + " " +
				(convertible ? "Convertible" : ""));
	}
}