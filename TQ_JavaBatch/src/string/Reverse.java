package string;

import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {
		String s="hello";
		
		
		char ch[]=s.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		//System.out.println(s);
		
		s=Arrays.toString(ch);
		System.out.println(s);
		
		for(int i=0;i<ch.length/2;i++)
		{
			char temp=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=temp;
		}
            s= Arrays.toString(ch);
            System.out.println(s);
	}

}
