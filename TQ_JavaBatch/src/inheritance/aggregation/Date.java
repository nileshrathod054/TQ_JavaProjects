package inheritance.aggregation;

public class Date {
	int mm, dd, yyyy;

	public Date(int mm, int dd, int yyyy) {
		this.mm = mm;
		this.dd = dd;
		this.yyyy = yyyy;

	}

	@Override
	public String toString() {
		return mm + "/" + dd + "/" + yyyy;
	}

}
