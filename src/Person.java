
public class Person {
	//attributes
	private int ID;
	private String Name;
		
	//constructor
	public Person(int ID, String Name){
		this.ID =ID;
		this.Name = Name;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getID() {
		return ID;
	}
	
	//method
}
