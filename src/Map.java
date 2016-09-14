
public class Map extends Item {
	int Year;
	String Scale;
	public Map(int ItemID, String Name,int Year,String Scale) {
		super(ItemID, "Map", Name);
		this.Year = Year;
		this.Scale = Scale;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	public String getScale() {
		return Scale;
	}
	public void setScale(String scale) {
		Scale = scale;
	}

}
