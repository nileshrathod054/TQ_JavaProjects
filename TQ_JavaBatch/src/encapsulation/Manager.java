package encapsulation;

class Manager {

	private int m_id;
	private String m_name;
	private MyDate m;

	public int getM_id() {
		return m_id;
	}

	public void setM_id(int m_id) {
		this.m_id = m_id;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public MyDate getM() {
		return m;
	}

	public void setM(MyDate m) {
		this.m = m;
	}

	@Override
	public String toString() {
		return "Manager [m_id=" + m_id + ", m_name=" + m_name + ", m=" + m + "]";
	}

}

class Student11 {
	int rll;
	String name;
	MyDate d;
}
