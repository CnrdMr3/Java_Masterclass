public class Exercise9_AreaCalculator {
	public static double area(double radius) {

		if (radius < 0.0) {
			return -1.0;
		} else {
			return (Math.PI * radius * radius);
		}

	}

	public static double area (double x, double y) {
		if((x < 0.0) || (y < 0.0)) {
			return -1.0;
		} else {
			return (x * y);
		}
	}
}
