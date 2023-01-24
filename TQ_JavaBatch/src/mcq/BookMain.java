package mcq;

public class BookMain {
	static Book showDetails() {

		Book b = new Book();
		b.setId(101);
		b.setName("c");
		b.setPrice(200);
//System.out.println("id is.."+b.getId());
//System.out.println("name is..."+b.getName());
//System.out.println("price is..."+b.getPrice());
		return b;
	}
}
