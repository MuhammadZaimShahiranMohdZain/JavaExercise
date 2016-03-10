package sumOfTwoClosestToZeroElements;
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
    	int priority = 0;
    	int compare;
    	int min = (int) Double.POSITIVE_INFINITY;
    	for(int temp:a){
//    		System.out.println(min + "	" + temp);
//    		System.out.println("Compare: " + Integer.compareUnsigned(temp, min));
//    		System.out.println();
    		
    		/*why the comparison between 3 & -1 is wrong*/
//    		if(Integer.compareUnsigned(temp, min)<0)
//    		if(Math.abs(temp) == min)
//    			min = ;
    		if(Math.abs(temp) < min)
    			min = temp;
    		System.out.println(temp);
    	}
		return min;
    }
    public static void main(String[] args) {
		int[] a = {3,-5,4,-1,2,1};
		System.out.println(getSumOfTwoClosestToZeroElements(a));
	}
}
