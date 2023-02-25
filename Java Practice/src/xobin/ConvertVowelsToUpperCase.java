package xobin;

public class ConvertVowelsToUpperCase {
	public static void main(String[] args) {
		
		String as = "hello world";
		char[] arr = as.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
				if (arr[i] >= 97 && arr[i] <= 122) {
					arr[i] = (char) ((char) arr[i] - 32);
				}
			}
			System.out.print(arr[i]);
		}
	}
}
