package accenture;

import java.util.Scanner;

public class CristinaMethodology {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] t = new int[n];
	        for (int i = 0; i < n; i++) {
	            t[i] = sc.nextInt();
	        }
	        int result = 0;
	        int sum = 0;
	        for (int i = 0; i < n; ++i) {
	            if (sum + t[i] <= t[i]) {
	                result++;
	                sum += t[i];
	            }
	        }
	        System.out.println(result);
	    }
}
