public class Main {

	public static void main(String[] args) {

		Car car = new Car();
	//  Car car = null; -> Causes 'NullPointerException'.

		car.setMake("Alfa-Romeo");
		car.setModel("GTA");
		car.setDoors(2);
		car.setConvertible(true);
		car.setColor("White");

		System.out.println("make = " + car.getMake());
		System.out.println("model = " + car.getModel());
		car.describeCar();

	// New Car object:
		Car targa = new Car();
		targa.setMake("Porsche");
		targa.setModel("Targa");
		targa.setDoors(2);
		targa.setConvertible(false);
		targa.setColor("black");
	// Print targa:
		targa.describeCar();
	}
}