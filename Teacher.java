public class Teacher extends Person {


//attributes
	private String department;

	//constructors

	public Teacher(){

		this.department = "Life Siences";

	}
	

	public Teacher(String department) {
		this.department = department;
	}
	
	//mutators

	public String getDepartment(){
		return this.department;

	}

	public void setDepartment(String department){

		this.department = department;
	}



	//toString method
	public String toString(){
		return super.toString() + " I am a professor. My department is: " + this.department;
	}


}