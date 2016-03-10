package positiveNumber;

public class PositiveNumber {
	public int[] isPositive(int[] a)
	{
		/*
        Please implement this method to
        return a new array with only positive numbers from the given array.
        The elements in the resulting array shall be sorted in the ascending order.
       */
		int[] temp=new int[a.length];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]>=0) {
				temp[j] = a[i];
				j++;
			}
		}
		int[] output = new int[j];
		for (int i = 0; i < output.length; i++) {
			output[i]=temp[i];
		}
		return output;
	}
}
