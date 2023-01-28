package string;

import java.util.Arrays;

public class WithoutSplit {

	public static void main(String[] args) {
		// String s="India is country";

		/*
		 * char ch[]=s.toCharArray(); int count=0;
		 * 
		 * for(int i=0;i<ch.length;i++) { if(ch[i]==' ') { count++;
		 * 
		 * } System.out.print(ch[i]); } //System.out.println(" ");
		 * 
		 * System.out.println(count+1);
		 */

		String arr[] = new String[3];
		// printing string without using split method
		/*
		 * char ch[]=s.toCharArray(); int count=0; String str="";
		 * 
		 * for(int i=0;i<ch.length;i++) {
		 * 
		 * System.out.print(ch[i]);
		 * 
		 * 
		 * if(ch[i]==' ') { System.out.println(""); }
		 * 
		 * }
		 */
		// counting of words

		// String str=new String(ch);
//		System.out.println(str);

		String str = "";
		// System.out.println(" ");

		// System.out.println(count+1);

		// printing words in the form of string array
		String s = "India is country";
		char ch[] = s.toCharArray();
		int count = 0;

		String[] str2 = new String[3];
		int j = 0;

		for (int i = 0; i < ch.length; i++) {

			str = str + ch[i];
			// System.out.println(str);

			if (ch[i] == ' ') {

				str2[j] = str;
				j++;
				str = "";
				count++;
				continue;
			}

			if (count == str2.length - 1) {
				// str="";

				// str=str+ch[i];

				str2[j] = str;

			}
			if (i == ch.length - 1) {
				break;
			}

		}

		for (String st : str2) {
			System.out.println(st);
		}

	}

}
