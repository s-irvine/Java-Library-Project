
public abstract class Item {
	
	//attributes
	private boolean CheckedOut;
	private int ItemID;
	private String ItemType;
	private String Name;
	
	//constructor
	public Item(int ItemID, String ItemType, String Name){
			this.CheckedOut=false;
			this.ItemID = ItemID;
			this.ItemType=ItemType;
			this.Name = Name;
	}

	public boolean isCheckedOut() {
		return CheckedOut;
	}

	public void setCheckedOut(boolean checkedOut) {
		CheckedOut = checkedOut;
	}

	public int getItemID() {
		return ItemID;
	}

	public void setItemID(int itemID) {
		ItemID = itemID;
	}

	public String getItemType() {
		return ItemType;
	}

	public void setItemType(String itemType) {
		ItemType = itemType;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	//methods
}
