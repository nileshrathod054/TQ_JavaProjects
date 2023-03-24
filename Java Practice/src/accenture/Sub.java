package accenture;
class Super{
	public static String s="Inside class";
	public Super() {
		System.out.println("1");
	}
}
public class Sub {
public Sub() {
	System.out.println("2");
	//super();
}
public static void main(String[] args) {
	Sub obj=new Sub();
	System.out.println(s);
}
}
