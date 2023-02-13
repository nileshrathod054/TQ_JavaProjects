package mock;

public class ReverseString{
	public static void main(String[] args) {
		String s = "Java is a object oriented programming";
		char ch[] = s.toCharArray();
//		for (int i = 0; i < ch.length; i++) {
//			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
//				ch[i]='$';
//			}
//		}
//		for (int i = 0; i < ch.length; i++) {
//			System.out.print(ch[i]);
//		}
		String rev = "";
		int length = ch.length;
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + ch[i];
		}
		System.out.println(rev);
	}
}
