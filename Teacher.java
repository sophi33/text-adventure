public class Teacher extends Person {


	//attributes
	private String department;
	private boolean isAlien;

	//constructors

	public Teacher(){

		this.department = "Life Sciences";

	}

	public Teacher(boolean isAlien, String department){
		this.isAlien = isAlien;
		this.department = department;
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

	public boolean setIsAlien(boolean isAlien){
		this.isAlien = isAlien;
	}

	public void getIsAlien(){
		return this.getIsAlien;
	}



	//toString method
	public String toString(){
		return super.toString() + " I am a professor. My department is: " + this.department;
	}


}