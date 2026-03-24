
public class TestCollegeANDTeacher {

	public static void main(String[] args) {
		
		College c1 = new College();
		
		c1.collegenm = "PR Patil";
		c1.totalStudent = 1500;
		
		System.out.println("collegenm:" + c1.collegenm);
		System.out.println("totalStudent:" + c1.totalStudent);
		
		c1.openCollege();
		c1.closeCollege();
		
		
		Teacher t1 = new Teacher();
		
		t1.subject = "ENGLISH";
		t1.experience = 13;
		
		System.out.println("subject:"+ t1.subject);
		System.out.println("experience:"+ t1.experience);
		
		t1.teach();
		t1.checkHomeWork();
		
		
		
		
		
		
	}
}
