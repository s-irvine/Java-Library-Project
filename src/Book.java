
public class Book extends Item {
	private String ISBN;
	private String Blurb;
	

	public Book(int ItemID, String Name, String ISBN) {
		super(ItemID,"Book", Name);
		this.ISBN = ISBN;
		
	}


	public String getISBN() {
		return ISBN;
	}


	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}


	public String getBlurb() {
		return Blurb;
	}


	public void setBlurb(String blurb) {
		Blurb = blurb;
	}

}
