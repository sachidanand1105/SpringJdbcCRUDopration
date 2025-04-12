package in.sp.bean;

public class Student {

	int std_roll;
	String std_name;
	float std_marks;
	public int getStd_roll() {
		return std_roll;
	}
	public void setStd_roll(int std_roll) {
		this.std_roll = std_roll;
	}
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
	public float getStd_marks() {
		return std_marks;
	}
	public void setStd_marks(float std_marks) {
		this.std_marks = std_marks;
	}
	
	public void display() {
		
		System.out.println("Rollno: "+std_roll);
		System.out.println("Name: "+std_name);
		System.out.println("Marks: "+std_marks);
		System.out.println("-------------------");
	}
}
