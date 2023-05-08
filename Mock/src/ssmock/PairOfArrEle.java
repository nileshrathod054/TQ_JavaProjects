package ssmock;
//Q1. Find the pair of elements from the given array whose sum is equal to given input
import java.util.Arrays;

public class PairOfArrEle {
	public static void main(String[] args) {

		int arr[]= {15,12,4,16,9,8,24,0};
		int num=24;
		System.out.println("The array created is: " + Arrays.toString(arr));
		System.out.println("Element of an array whose sum is : " + num);
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] + arr[j] == num && i != j) {
					System.out.println(arr[i] + " , " + arr[j]);
				}
			}
		}
	}
}
