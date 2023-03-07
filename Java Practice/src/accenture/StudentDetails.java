package accenture;

public class StudentDetails {
	int id;
	String name;
	int age;
	
	StudentDetails(){
		
	}
	StudentDetails(int id, String name, int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public static void main(String[] args) {
		StudentDetails s1=new StudentDetails(101,"Vaishu",21);
	}
}
