public class PaintJob {

	public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
		if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
			return -1;
		}

		double wallArea = width * height;
		double bucketsNeeded = Math.ceil(wallArea / areaPerBucket);
		int bucketsToBuy = (int) (bucketsNeeded - extraBuckets);

		return bucketsToBuy;
	}

	public static int getBucketCount(double width, double height, double areaPerBucket) {
		if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
			return -1;
		}

		double wallArea = width * height;
		double bucketsNeeded = Math.ceil(wallArea / areaPerBucket);

		return (int) bucketsNeeded;
	}

	public static int getBucketCount(double area, double areaPerBucket) {
		if (area <= 0 || areaPerBucket <= 0) {
			return -1;
		}

		double bucketsNeeded = Math.ceil(area / areaPerBucket);

		return (int) bucketsNeeded;
	}

	public static void main(String[] args) {
		// Example usage
		System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2)); // -1
		System.out.println(getBucketCount(3.4, 2.1, 1.5, 2)); // 3
		System.out.println(getBucketCount(2.75, 3.25, 2.5, 1)); // 3

		System.out.println(getBucketCount(-3.4, 2.1, 1.5)); // -1
		System.out.println(getBucketCount(3.4, 2.1, 1.5)); // 5
		System.out.println(getBucketCount(7.25, 4.3, 2.35)); // 14

		System.out.println(getBucketCount(3.4, 1.5)); // 3
		System.out.println(getBucketCount(6.26, 2.2)); // 3
		System.out.println(getBucketCount(3.26, 0.75)); // 5
	}
}