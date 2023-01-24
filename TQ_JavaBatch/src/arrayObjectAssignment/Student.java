package arrayObjectAssignment;


public class Student {
	int id;
	String name;
	boolean isSpecial=false;
	Course c;
	public Student (int id, String name, Course c) {
		super();
		this.id=id;
		this.name=name;
		this.c=c;
		
	}
	@Override
	public String toString() {
		return "Student[id="+id+",name="+",c="+c+"]";
	}
}


