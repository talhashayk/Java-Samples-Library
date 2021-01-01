import java.util.Arrays;

public class Search {

	public static void main(String[] args) {
		
		int[] i = {3,6,7,14,55,44,23,43,23,
					244,42,12,322,89,56,34,
					28,45,67,25,17,489,41};
		
		System.out.println("Unsorted Array: " + Arrays.toString(i));
		Arrays.sort(i);
		System.out.println("Sorted Array: " + Arrays.toString(i));
		System.out.println("Location of 25: " + Arrays.binarySearch(i, 25));
		
		}
		
	}
	

