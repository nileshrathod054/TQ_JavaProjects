package accenture;

import java.util.Scanner;

public class Main1 {
	int n;
public void helper_function() {
	Scanner sc=new Scanner(System.in);
	
	n=sc.nextInt();
	
}
public static int minCoinsReversed(int[]num) {
	int changedWithLeading0=0;
	int changedWithLeading1=1;
	for(int i=0;i<num.length;i++) {
		if(num[i]==1-(i%2)) {
			 changedWithLeading0++;
		}
		if(num[i]==i%2) {
			 changedWithLeading1++;
		}
	}
	return Math.min(changedWithLeading0, changedWithLeading1);
}
public static void main(String[] args) {
	int n=0;
	Main1 m=new Main1();
	m.helper_function();
	int num[]=new int [n];
	for(int i=0; i<n; i++) {
		Scanner sc=new Scanner(System.in);
		num[i]=sc.nextInt();
	}
	System.out.println(minCoinsReversed(num));
	
}
}
