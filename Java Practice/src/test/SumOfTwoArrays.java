package test;

public class SumOfTwoArrays {

//	public static void main(String[] args) {
//		int[] arr1 = {2, 3, 4, 5, 6};
//		int[] arr2 = {5, 6, 7, 8, 9};
//
//		int[] result = new int[arr1.length];
//
//		for(int i = 0; i < arr1.length; i++) {
//			result[i] = arr1[i] + arr2[i];
//			System.out.println("Sum of " + arr1[i] + " and " + arr2[i] + " is " + result[i]);
//		}
//	}
	  public static void main(String[] args) 
	    {
	        int[] arr1 = {2,4,6,8,9};
	        int[] arr2 = {1,3,5,7,11,13};

	        int[] result = new int[arr2.length];

	        for(int i=0; i<arr1.length; i++)
	        {
	            result[i] = arr1[i] + arr2[i];
	        }

	        for(int j=arr1.length; j<arr2.length; j++)
	        {
	            result[j] = arr2[j];
	        }

	        System.out.println("Resultant Array: ");
	        for(int k=0; k<arr2.length; k++)
	        {
	            System.out.print(result[k] + " ");
	        }
	    }
}
