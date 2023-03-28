package jan2020;

import java.util.Objects;

public class Emp implements Comparable<Emp> {
	int id;
	String name;

	public Emp() {

	}

	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("Emp [id=%s, name=%s]", id, name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Emp o) {
		if (id < o.id)
			return -1;
		else if (id > o.id)
			return 1;
		else
			return 0;
	}

}
