import java.util.Arrays;

public class AlmostPrimeNumber {

	public static void main(String[]args)
	{
		countAlmostPrimeNumbers(1, 2);
	}
    public static int countAlmostPrimeNumbers(int from, int to) {
        /*
          A prime number is a natural number that has exactly two distinct natural number divisors,
          which are 1 and the prime number itself.
          The first prime numbers are: 2, 3, 5, 7, 11, 13.

          Almost prime numbers are the non-prime numbers
          which are divisible by only a single prime number.

          Please implement this method to
          return the number of almost prime numbers within the given range (inclusively).
         */
    	
    	int[] input = {5,4,2,3,1};
    	Arrays.sort(input);
    	System.out.println(input[3]);
    	return 0;
    }
}
