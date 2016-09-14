import java.util.ArrayList;

public class Library {
	
	//attributes
	ArrayList<Item> LibraryItems;
	ArrayList<Person> RegisteredPeople;
	private String LibraryName;
	//constructor
	public Library(String LibraryName){
		this.LibraryName = LibraryName;
		LibraryItems = new ArrayList<Item>();
		RegisteredPeople = new ArrayList<Person>();
	}
	//method
	public void AddItem(Item item){
		LibraryItems.add(item);
	}
	public void RemoveItem(int index){
		LibraryItems.remove(index);
	}
	public void UpdateItem(Item item, String name){
		item.setName(name);
		
	}
	public void setLibraryName(String libraryName) {
		LibraryName = libraryName;
	}
	public void AddPerson(Person person){
		//add person
		RegisteredPeople.add(person);
	}
	public void RemovePerson(int index){
		//remove person
		RegisteredPeople.remove(index);
	}
	public void UpdatePerson(Person person, String name){
		//update person
		person.setName(name);
	}
	public void CheckOutItem(Item item){
		item.setCheckedOut(true);	
	}
	public void CheckInItem(Item item){
		item.setCheckedOut(false);
	}
	public void GetItemDetails(Book book){
		StringBuilder sb = new StringBuilder();
		sb.append("ISBN " + book.getISBN() + "\n");
		sb.append("ID " + book.getItemID() + "\n");
		sb.append("Name " + book.getName() + "\n");
	}
	public void GetItemDetails(GovernmentDocument GDoc){
		StringBuilder sb = new StringBuilder();
		sb.append("Country " + GDoc.getCountry() + "\n");
		sb.append("ID " + GDoc.getItemID() + "\n");
		sb.append("Name " + GDoc.getName() + "\n");
	}
	public ArrayList<Item> getLibraryItems() {
		return LibraryItems;
	}
	public void setLibraryItems(ArrayList<Item> libraryItems) {
		LibraryItems = libraryItems;
	}
	public ArrayList<Person> getRegisteredPeople() {
		return RegisteredPeople;
	}
	public void setRegisteredPeople(ArrayList<Person> registeredPeople) {
		RegisteredPeople = registeredPeople;
	}
	public String getLibraryName() {
		return LibraryName;
	}
	
}
