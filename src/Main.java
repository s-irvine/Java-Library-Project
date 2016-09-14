
public class Main {

	public static void main(String[] args) {
		
		//Create library
		Library testLibrary = new Library("my Library");
		//Add Stuff
		testLibrary.AddItem(new Book(0, "Java","AB51"));
		testLibrary.AddItem(new GovernmentDocument(1, "Top Secret Memes","United Kingdom"));
		testLibrary.AddPerson(new Person(007, "James"));
		testLibrary.AddPerson(new Person(597, "Jane"));
		// do things in Library
		testLibrary.UpdateItem((testLibrary.LibraryItems.get(0)),"Java 1");
		testLibrary.UpdatePerson(testLibrary.RegisteredPeople.get(0),"Mark");
		testLibrary.CheckOutItem(testLibrary.LibraryItems.get(1));
		testLibrary.CheckInItem(testLibrary.LibraryItems.get(1));
		testLibrary.RemoveItem(1);
		testLibrary.RemovePerson(0);
		
		
	}

}
