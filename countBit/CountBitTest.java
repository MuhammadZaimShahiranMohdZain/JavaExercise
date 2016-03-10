package countBit;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CountBitTest {

	CountBit count = new CountBit();

	@Test
	public void test() {
		int input = 170;
		System.out.println(count.getRequiredNumberOfBits(input));
	}
}
