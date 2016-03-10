package perfectNumber;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerfectNumberTest {

	@Test
	public void test() {
		PerfectNumber perfect = new PerfectNumber();
		System.out.println(perfect.isPerfect(28));
	}

}
