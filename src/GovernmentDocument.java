
public class GovernmentDocument extends Item {
	private String Country;
	public GovernmentDocument(int ItemID, String Name, String Country) {
		super(ItemID, "Government Document", Name);
		this.Country = Country;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}

}
