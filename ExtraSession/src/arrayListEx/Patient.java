package arrayListEx;

public class Patient {
	int p_id;
	String p_name;
	String d_name;
	String location;

	public Patient(int p_id, String p_name, String d_name, String location) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.d_name = d_name;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Patient [p_id=" + p_id + ", p_name=" + p_name + ", d_name=" + d_name + ", location=" + location + "]";
	}
}