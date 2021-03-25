package project;

public class Student {
	private static String[] name = new String[1000];
	private static String[] iD = new String[1000];
	private static String[] address = new String[1000];
	private static String[] phone = new String[1000];
	private static int[] grades = new int[100];
	static private String[] courses = new String[1000];
	
	
	static String[] StName = new String[1000];
	static String[] StID = new String[1000];
	static String[] StAddress = new String[1000];
	static String[] StPhone = new String[1000];
	static String[] StCourse = new String[1000];

	public static void getStudents() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(name[i] + " " + iD + " " + address[i] + " " + phone[i]+ " "+courses[i]);
		}
	}
	
	public static void getStudentsCourse(String course) {
		for (int i = 0; i < 1000; i++) {
			if(StCourse[i] == course) {
			System.out.println(name[i] + " " + iD + " " + address[i] + " " + phone[i]+ " "+courses[i]);
		}
	}
	}

	public static void setStudents(String name, String iD, String address, String phone, String courses) {
		int number = 0;
		for (int i = 0; i < 1000; i++) {
			if (StName[i] == null) {
				number = i;
				break;

			}
			StName[number] = name;

			if (StID[i] == null) {
				number = i;
				break;
			}
			StID[number] = iD;

			if (StAddress[i] == null) {
				number = i;
				break;
			}
			StAddress[number] = address;

			if (StPhone[i] == null) {
				number = i;
				break;
			}
			StPhone[number] = phone;
			
			if (StCourse[i] == null) {
				number = i;
				break;
			}
			StCourse[number] = courses;
		}
		System.out.println("Student Added");
	}

	public static void enrollCourse(String course) {
		for (int i = 0; i < 40; i++) {
			if (courses[i] == null) {
				courses[i] = course;
				System.out.println("Successfully Enrolled in Course");
			}
		}
	}

	public static void withdrawCourse(String course) {
		for (int i = 0; i < 40; i++) {
			if (courses[i] != course ) {
				courses[i] = null;
				System.out.println("Successfully Withdrawn from Course");
			}
		}
	}
	public static void getGradesCourses(int Grades) {
		// Assuming max course load is 6
		for (int i = 0; i < 6; i++) {
			System.out.println(grades[i] + " " + courses);
		}
		}
	}

