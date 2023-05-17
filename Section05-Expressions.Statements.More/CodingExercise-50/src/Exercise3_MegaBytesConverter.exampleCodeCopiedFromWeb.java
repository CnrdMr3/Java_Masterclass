
// Java implementation of above program

import java.math.BigInteger;


class GFG {

	// Function to calculate the bits
	static BigInteger Bits(int kilobytes) {
		BigInteger Bits = new BigInteger("0");

		// calculates Bits
		// 1 kilobytes(s) = 8192 bits

		BigInteger kilo = BigInteger.valueOf(kilobytes);
		Bits = kilo.multiply(BigInteger.valueOf(8192));

		return Bits;
	}

	// Function to calculate the bytes
	static BigInteger Bytes(int kilobytes) {
		BigInteger Bytes = new BigInteger("0");

		// calculates Bytes
		// 1 KB = 1024 bytes

		BigInteger kilo = BigInteger.valueOf(kilobytes);
		Bytes = kilo.multiply(BigInteger.valueOf(1024));

		return Bytes;
	}

	// Driver code
	public static void main(String args[]) {
		int kilobytes = 1;

		System.out.print(kilobytes + " Kilobytes = "
				+ Bytes(kilobytes) + " Bytes and "
				+ Bits(kilobytes) + " Bits.");
	}
}
