package project;

public class Instructor {
	// creating variables
	static String[] instructorName = new String[100];
	static String[] instructorID = new String[100];
	static String[] address = new String[100];
	static String[] phone = new String[100];
	static String[] courses = new String[40];

	// creating variables for setting data
	static String[] insName = new String[100];
	static String[] insID = new String[100];
	static String[] insAddress = new String[100];
	static String[] insPhone = new String[100];
	static String[] inscourse = new String[100];

	// adds course to the course list
	public static void addCourse(String crs1) {
		for (int i = 0; i < 40; i++) {
			if (courses[i] != null) {
				System.out.println("You Cannot Add More Courses\n");
				break;
			} else
				courses[i] = crs1;
			System.out.println("Course Successfully Added\n");
			break;
		}

	}

	// method to add instructor in data
	public static void setInstructor(String name, String iD, String address, String phone, String courses) {
		int number = 0;
		for (int i = 0; i < 100; i++) {
			if (insName[i] == null) {
				number = i;
				break;

			}
			insName[number] = name;

			if (insID[i] == null) {
				number = i;
				break;
			}
			insID[number] = iD;

			if (insAddress[i] == null) {
				number = i;
				break;
			}
			insAddress[number] = address;

			if (insPhone[i] == null) {
				number = i;
				break;
			}
			insPhone[number] = phone;

			if (inscourse[i] == null) {
				number = i;
				break;
			}
			inscourse[number] = courses;
		}
		System.out.println("Instructor added");
	}

	// method to print all the instructors in system
	public static void getInstructors() {
		for (int i = 0; i < 10; i++) {
			System.out.println(instructorName[i] + " " + instructorID + " " + address[i] + " " + phone[i]);
		}
	}

	// method to print courses taught by a instructor
	public static void getInstructorCourses() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Courses being taught: " + inscourse[i]);
		}
	}
}
