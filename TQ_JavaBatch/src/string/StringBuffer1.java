package string;

public class StringBuffer1 {

	public static void main(String[] args) {
		char ch[] = { 'a', 'b', 'c' };

		// capacity=capacity*2+2;

//		CharSequence a=new String("hello");
//		StringBuffer sb=new StringBuffer();
//		StringBuffer sb1=new StringBuffer("hello");
//		StringBuffer sb2=new StringBuffer(3);
//		StringBuffer sb3=new StringBuffer(a);
//		
//		
//		//System.out.println(sb3.capacity());

		StringBuffer sb1 = new StringBuffer();
		sb1.append("red");
		sb1.append("red");

		sb1.append("red");
		sb1.append("red");
		sb1.append("red");
		sb1.append("red");
		/*
		 * sb1.append("red"); sb1.append("red"); sb1.append("red"); sb1.append("red");
		 * sb1.append("red");
		 */

		System.out.println(sb1);
		System.out.println(sb1.capacity());

	}

}
