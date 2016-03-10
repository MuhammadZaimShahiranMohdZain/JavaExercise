import java.util.Arrays;

import javax.print.DocFlavor.STRING;
import java.util.*;

public class BetterProgrammerTask0 {

    public String[] sortIgnoringSpaces(String[] a) {
        /*
          Please implement this method to
          sort a given array of Strngs in alphabetical order
          ignoring spaces (' ' symbols) within the strings.
         */
    	Arrays.sort(a);
    	return a;
    }
}


class BetterProgrammerTask1 {

    int getSumOfNumbers(String s) {
        /*
          Please implement this method to
          return the sum of all integers found in the parameter String. You can assume that
          integers are separated from other parts with one or more spaces (' ' symbol).
          For example, s="12 some text 3  7", result: 22 (12+3+7=22)
         */
    	return 0;
    }
}




class BetterProgrammerTask2 {

	Set<Object> getIntersection(Set<Object> a, Set<Object> b) {
		return b;
        /*
          Please implement this method to
          return a Set equal to the intersection of the parameter Sets
          The method should not chage the content of the parameters.
         */
    }
}



class BetterProgrammerTask3 {

    Object[] reverseArray(Object[] a) {
        /*
          Please implement this method to
          return a new array where the order of elements has been reversed from the original
          array.
         */
    	Object[] b = new Object[a.length];
    	for (int i = 0; i < a.length; i++) {
			a[i]=b[b.length-i];
		}
		return b;
    }
}
