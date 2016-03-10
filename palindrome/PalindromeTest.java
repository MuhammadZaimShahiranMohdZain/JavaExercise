package palindrome;
import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class PalindromeTest {

	Palindrome plain = new Palindrome();
	String in;
	@Before
	public void setUp() throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.println("Input");
		in=  input.next();
	}

	@Test
	public void test() {
		assertTrue(plain.isPalindrome(in));
	}

}
