package arrayexample;

import java.util.Arrays;

public class TwoUnsortedArrays {

		
		 

	    public static int[] mergeArray(int[] arrayA, int[] arrayB)
	    {
	        int[] mergedArray = new int[arrayA.length + arrayB.length];
	         
	        int i=0, j=0, k=0; 
	                 
	        while (i < arrayA.length) 
	        {
	            mergedArray[k] = arrayA[i];
	            i++;
	            k++;
	        } 
	                 
	        while (j < arrayB.length) 
	        {
	            mergedArray[k] = arrayB[j];
	            j++;
	            k++;
	        } 
	             
	        Arrays.sort(mergedArray);
	         
	        return mergedArray;
	    }
	     
	    public static void main(String[] args) 
	    {
	        int[] arrayA = new int[] {3, -8, 6, 9, 2, -1, 21};
	         
	        int[] arrayB = new int[] {87, 8, 71, -9, 98};
	         
	        int[] mergedArray = mergeArray(arrayA, arrayB);
	         
	        System.out.println("Array A : "+Arrays.toString(arrayA));
	         
	        System.out.println("Array B : "+Arrays.toString(arrayB));
	         
	        System.out.println("Merged Array : "+Arrays.toString(mergedArray));
	    }
}
	
