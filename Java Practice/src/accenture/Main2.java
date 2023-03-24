package accenture;

class TestA{
	int xyz=15;
}
class TestB extends TestA{
	int xyz=25;
}
public class Main2 {
public static void main(String[] args) {
	TestA obj=new TestB();
	System.out.println(obj.xyz);
}
}
