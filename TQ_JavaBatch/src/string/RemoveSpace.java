package string;

public class RemoveSpace {

	public static void main(String[] args) {
		String s = "s u r a j";

		String s2 = "java is programming is";

		System.out.println("----replace-----");

		String temp = s.replace('r', '-');

		System.out.println(temp);

		String temp2 = s2.replace("pro", "language");

		System.out.println(temp2);

		String temp3 = s2.replaceFirst("is", "is..");

		System.out.println(temp3);

		System.out.println("---contains--");
		boolean b = s2.contains("P");
		if (b == true) {
			System.out.println("Given word is present");
		} else
			System.out.println("not present");

		/*
		 * char ch[]= temp.toCharArray();
		 * 
		 * for(int i=0;i<ch.length;i++) { if(ch[i]!='\0') { System.out.print(ch[i]); } }
		 */

	}

}
