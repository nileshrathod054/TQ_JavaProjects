package xobin;

import java.util.ArrayList;
import java.util.Scanner;

public class DivisibleByThree {
public static void main(String[] args) {
	ArrayList<Integer>al=new ArrayList<>();
	Scanner sc =new Scanner(System.in);
	for(int i=0; i<9; i++) {
		al.add(sc.nextInt());
	}
	for(int a:al) {
		if(a%3==0) {
			System.out.print(a+" ");
		}
	}
}
}
