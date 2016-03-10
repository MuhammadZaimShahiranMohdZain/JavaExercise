package sumOfTwoClosestToZeroElements;
import static org.junit.Assert.*;

import org.junit.Test;

public class SumOfTwoClosestToZeroElementsTest {

	@Test
	public void test() {
		int[] a = {3,5,4,-1,2};
		assertEquals(-1, SumOfTwoClosestToZeroElements.getSumOfTwoClosestToZeroElements(a));
    }

}
