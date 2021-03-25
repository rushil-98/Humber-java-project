package project;

public class Courses {
	// creating variables
	static String[] courseCode = new String[40];
	static String[] courseName = new String[40];
	static String[] sectionNumber = new String[40];

	// creating variables for setting data
	static String[] CrName = new String[40];
	static String[] CrCode = new String[40];
	static String[] CrSection = new String[40];

	// method to get all courses in system
	public static void getCourses() {
		for (int i = 0; i < 40; i++) {
			System.out.println(courseCode[i] + " " + courseName + " " + sectionNumber[i]);
		}
	}

	// method to get list of students enrolled in course
	public static void getEnrolledStudents() {
		// 100 students limit in each course
		for (int i = 0; i < 100; i++) {
			System.out.println(Student.StName[i] + " " + courseName + " " + sectionNumber[i]);
		}
	}

	// method to add a course to the system
	public static void setCourse(String courseCode, String courseName, String sectionNumber) {
		int number = 0;
		for (int i = 0; i < 40; i++) {
			if (CrName[i] == null) {
				number = i;
				break;

			}
			CrName[number] = courseName;

			if (CrCode[i] == null) {
				number = i;
				break;
			}
			CrCode[number] = courseCode;

			if (CrSection[i] == null) {
				number = i;
				break;
			}
			CrSection[number] = sectionNumber;
		}
		System.out.println("Course Added");
	}

}
