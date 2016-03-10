import static org.junit.Assert.*;

import org.junit.Test;

public class CapitalizeFirstLetterTest {

	@Test
	public void test() {
		CapitalizeFirstLetter better = new CapitalizeFirstLetter();
		better.capitalizeFirstLetters("i like u & me");
//		System.out.println(better.capitalizeFirstLetters("i like you & me"));
	}

}
