public class Student extends Person {


//attributes
	private String major;

	//constructors

	public Student(){

		this.major = "music";

	}
	

	public Student(String major) {
		this.major = major;
	}
	
	//mutators

	public String getMajor(){
		return this.major;

	}

	public void setMajor(String major){

		this.major = major;
	}



	//toString method
	publuc String toString(){
		return super.toString() + " I am a student. My major is: " + this.major;
	}


}