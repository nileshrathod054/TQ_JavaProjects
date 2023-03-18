package accenture;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		int n;
		long elm;
		int cnt = 1;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		long sum = 0;
		List<Long> v = new ArrayList<Long>();
		for (int i = 0; i < n; ++i) {
			elm = sc.nextLong();
			v.add(elm);
		}
		Collections.sort(v);
		sum = v.get(0);
		for (int i = 1; i < n; ++i) {
			if (v.get(i) >= sum) {
				++cnt;
				sum += v.get(i);
			}
		}
		System.out.println(cnt);
	}

}
