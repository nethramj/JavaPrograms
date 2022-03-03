package arrayexample;


		// Java program to check if all array elements are
		// same or not.
		import java.util.Arrays;
		import java.util.HashSet;
		import java.util.Set;

		public class SameElements {
		public static boolean areSame(Integer arr[])
			{
			Integer first = arr[0];
			for (int i=1; i<arr.length; i++)
				if (arr[i] != first)
						return false;
			return true;
			}

			// Driver code
		public static void main(String[] args)
			{
				Integer[] arr = { 1, 1, 1, 1 };
				if (areSame(arr))
					System.out.println("All Elements are Same");
				else
					System.out.println("Not all Elements are Same");
	

	}

}
