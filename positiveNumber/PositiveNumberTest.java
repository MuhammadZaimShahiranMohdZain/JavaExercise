package positiveNumber;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class PositiveNumberTest {
	static String in;
	
	@Before
	public void setUp() throws Exception {
//		Scanner input = new Scanner(System.in);
//		System.out.println("Input");
//		in=  input.next();
	}
	@Test
	public void test() {
		int[] input = {3,-2,4,5,6,-6,-4};
		PositiveNumber positive = new PositiveNumber();
		input = positive.isPositive(input);
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]+"...");
		}
	}

}
