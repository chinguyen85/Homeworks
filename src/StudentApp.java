
public class StudentApp {

	public static void main(String[] args) {
		Student student1 = new Student("Cecelia", "300912");
		Student student2 = new Student("Katie", "261085", 15, true);
		Student student3 = new Student();
		
		System.out.println("\n****** Student 1 ******\n");
		student1.bePresent();
		student1.addStudyRecord(5);
		student1.addStudyRecord(25);
		student1.printInfo();
		
		System.out.println("\n****** Student 2 ******\n");
		student2.addStudyRecord(10);
		student2.printInfo();
		
		System.out.println("\n****** Student 3 ******\n");
		student3.beAbsent();
		student3.addStudyRecord(20);
		student3.printInfo();
	}

} // End of StudentApp

class Student {
	public String name;
	public String studentNumber;
	public int credits;
	public boolean attendanceStatus;
	
	public Student(String name, String studentNumber) {
		this.name = name;
		this.studentNumber = studentNumber;
		credits = 0;
		attendanceStatus = true;
	}
	
	public Student(String name, String studentNumber, int credits, boolean attendanceStatus) {
		this.name = name;
		this.studentNumber = studentNumber;
		this.credits = credits;
		this.attendanceStatus = attendanceStatus;
	}
	
	public Student() {
		name = "Selena";
		studentNumber = "141111";
		credits = 5;
		attendanceStatus = false;
	}
	
	public void addStudyRecord(int creditAmount) {
		if (attendanceStatus) {
			credits = credits + creditAmount;
		}
		else {
			System.out.println("Student is absent. Can't add study record.");
		}
	}
	
	public void printCreditInfo() {
		System.out.println("Has " + credits + " credits.");
	}
	
	public void bePresent() {
		attendanceStatus = true;
	}
	
	public void beAbsent() {
		attendanceStatus = false;
	}
	
	public void printInfo() {
		System.out.println("Name: " + name);
		System.out.println("Student number: " + studentNumber);
		printCreditInfo();
		if (attendanceStatus) {
			System.out.println("Student is present.");
		}
		else {
			System.out.println("Student is absent.");
		}
	}
}