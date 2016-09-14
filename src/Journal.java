
public class Journal extends Item {
	String Volume;
	int Year;
	public Journal(int ItemID, String Name,String Volume, int Year) {
		super(ItemID, "Journal", Name);
		this.Volume = Volume;
		this.Year = Year;
	}
	public String getVolume() {
		return Volume;
	}
	public void setVolume(String volume) {
		Volume = volume;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}

}
