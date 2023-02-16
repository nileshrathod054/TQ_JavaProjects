package setEx;

import java.util.Comparator;

public class Manager implements Comparable<Manager>, Comparator<Manager> {

	int m_id;
	String m_name;
	float salary;
	String location;

	public Manager() {

	}

	public Manager(int m_id, String m_name, float salary, String location) {
		super();
		this.m_id = m_id;
		this.m_name = m_name;
		this.salary = salary;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Manager [m_id=" + m_id + ", m_name=" + m_name + ", salary=" + salary + ", location=" + location + "]";
	}

	@Override
	public int compareTo(Manager o) {
		return this.m_name.compareTo(o.m_name);
	}

	@Override
	public int compare(Manager o1, Manager o2) {
		if (o1.salary < o2.salary)
			return 1;
		else if (o1.salary > o2.salary)
			return -1;
		else
			return 0;
	}

}
