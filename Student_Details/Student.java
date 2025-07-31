package Student_Details;

public class Student {
    
	private String Name;
	private int RollNo;
	private float Marks;
	
	
	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getRollNo() {
		return RollNo;
	}


	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}


	public float getMarks() {
		return Marks;
	}


	public void setMarks(float marks) {
		Marks = marks;
	}


	public static void main(String[] args) {
		Student s1=new Student();
		s1.setName("Vaishnavi");
		s1.setRollNo(101);
		s1.setMarks(90);
		
		System.out.println("Student Details");
	    System.out.println("=======================");
	    System.out.println("Name: "+s1.getName());
	    System.out.println("Roll No: "+s1.getRollNo());
	    System.out.println("Marks: "+s1.getMarks());
	    System.out.println("=======================");

	}

}
