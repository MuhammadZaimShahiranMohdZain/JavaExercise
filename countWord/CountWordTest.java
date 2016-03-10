package countWord;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class CountWordTest {

	CountWord count;
	Scanner in;
	
	@Before
	public void setUp() throws Exception {
		count = new CountWord();
		in = new Scanner(System.in);
	}

	@Test
	public void test() {
		System.out.println("Input");
		String s = in.nextLine();
		System.out.println(count.countWords(s));
	}

}
