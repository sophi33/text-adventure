
//sophie september 28 2017
public class Person{
	
	// charatceristics of person
	
	private String name;
	private String gender;
	private int age;
	private String health;

	//idea for game: you go around the college and the teachers are aliens!
	//health is because u can get shot by their ray guns 
	//3 times before the alien chemical poison contaminates your blood stream
	


	//zero argument constructor 

	public Person(){
		this.name = "Casey";
		this.gender = "female";
		this.age = 19;
		this.health = "100";
	}


	//loaded constructor
	public Person(String name, String gender, int age, String health) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.health = health;
	}

	//getters and setters for each attribute
	//name

	public String getName(){
			return this.name;

	}

	public void setName(String name){
		this.name = name;
	}


	//gender

	public String getGender(){
			return this.gender;

	}

	public void setGender(String gender){
		this.gender = gender;
	}

	//age

	public int getAge(){
		return this.age;

	}

	public void setAge(int age){
	this.age = age;
	}
	
	//health
	
	public String getHealth(){
		return this.health;

	}

	public void setHealth(String health){
	this.health = health;
	}

	public String toString(){
		return "Name: " + this.name + " Gender: " + this.gender + " Age: " + this.age + " Health: " + this.health;
	}
}