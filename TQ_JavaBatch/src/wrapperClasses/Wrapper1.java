package wrapperClasses;

//autoboxing :converting primitive type into objects
public class Wrapper1 {

	public static void main(String[] args) {
		int a = 10;
		String s = "1000";

//	Integer a1=new Integer(a);//boxing
//	
//	Integer a2=a;//autoboxing
//	
//   int x=	a2.compareTo(10);
//   System.out.println(x);
//   
//   
//   float f=a2.floatValue();
//   System.out.println(f);

		Integer i = Integer.valueOf(100);
		Integer i1 = Integer.valueOf(s);
		Integer i2 = Integer.valueOf("10000", 10);
		System.out.println(i);
		System.out.println(i1);
		System.out.println(i2);

// Unboxing:converting Objects type into primitive type
//   Integer  i11=10;
//   
//   int x1=i11;
//   
//   System.out.println(x1);
//   

	}

}
