import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SumOfTwoClosestToZeroElements {

    public static int getSumOfTwoClosestToZeroElements(int[] a) {
        /*
          Please implement this method to
          return the sum of the two elements closest to zero.
          If there are two elements equally close to zero like -2 and 2,
          consider the positive element to be "closer" to zero than the negative one.
         */
    	ArrayList<Integer> negative = new ArrayList<Integer>();
    	ArrayList<Integer> positive = new ArrayList<Integer>();
    	
    	for (int i = 0; i < a.length; i++) {
    		if (a[i]<0) {
    			negative.add(a[i]);
			} 
    		else {
				positive.add(a[i]);
			}
		}
    	int[] neg = new int[negative.size()];
    	int[] pos = new int[positive.size()];
    	for (int i = 0; i < negative.size(); i++) {
			System.out.println("neg");
    		System.out.println(negative.get(i));
		}
    	for (int i = 0; i < positive.size(); i++) {
    		System.out.println("pos");
			System.out.println(positive.get(i));
		}
		return 0;
    }
}
