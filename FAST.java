package project;

import java.util.Scanner;

public class FAST {

	public static void main(String[] args) {
		// scanner class object
		Scanner input = new Scanner(System.in);

		// This will be the main log in page to execute functions
		// For Admin to login => ID:admin and password: 111
		// For Instructors to login => ID:instructor and password: 222
		// For Students to login => ID:student and password: 333
		// If entered wrong, let them re-enter

		// Student array [1000]
		// Instructor array [100]
		// Courses array [40]

		boolean login = true;

		System.out.println("Welcome to Faculty of Applied Science ");
		do {

			System.out.println("Please enter your user name: ");
			String userName = input.next();

			System.out.println("Please enter your password for " + userName + ": ");
			String password = input.next();

			// determine whether the user name and password is correct or not

			while ("admin".equals(userName) && "111".equals(password)) {
				System.out.println("Login successful");
				do {

					// choose the operation you want to do

					System.out.println("Admin Page");
					System.out.println("Press 1 to Print Instructors");
					System.out.println("Press 2 to Print Students");
					System.out.println("Press 3 to Add Instructors");
					System.out.println("Press 4 to Add Students");
					System.out.println("Press 5 to Add Courses");
					System.out.println("Press 0 to Exit the system");
					System.out.println("Select your desired operation please");
					int select = input.nextInt();
					switch (select) {

					case 0:
						System.exit(0);
						break;

					case 1:
						Instructor.getInstructors();
						break;

					case 2:
						Student.getStudents();
						break;

					case 3:
						System.out.println("Enter name:");
						String iname = input.next();
						System.out.println("Enter id:");
						String iid = input.next();
						System.out.println("Enter address:");
						String iaddress = input.next();
						System.out.println("Enter phone:");
						String iphone = input.next();
						System.out.println("Enter course:");
						String icourse = input.next();

						Instructor.setInstructor(iname, iid, iaddress, iphone, icourse);
						break;
					case 4:
						System.out.println("Enter name:");
						String sname = input.next();
						System.out.println("Enter id:");
						String sid = input.next();
						System.out.println("Enter address:");
						String saddress = input.next();
						System.out.println("Enter phone:");
						String sphone = input.next();
						System.out.println("Enter Course:");
						String scourse = input.next();

						Student.setStudents(sname, sid, saddress, sphone,scourse);
						break;
					case 5:
						System.out.println("Enter Course Code:");
						String courseCode = input.next();
						System.out.println("Enter Course Name:");
						String courseName = input.next();
						System.out.println("Enter Section Number:");
						String sectionNumber = input.next();

						Courses.setCourse(courseCode, courseName, sectionNumber);
						break;
					default:
						break;
					}
				} while (true);
			}
			while ("instructor".equals(userName) && "222".equals(password)) {
				System.out.println("Login successful");
				do {

					System.out.println("Instructor Page");
					System.out.println("Press 1 to Print Students enrolled in a course");
					System.out.println("Press 2 to Print Courses");
					System.out.println("Press 3 to Add Courses");
					System.out.println("Press 0 to Exit the system");
					System.out.println("Select your desired operation please");
					int select = input.nextInt();
					switch (select) {

					case 0:
						System.exit(0);
						break;

					case 1: // Print students in course
						System.out.println("Enter course: ");
						String course = input.next();
						Student.getStudentsCourse(course);
						break;
					case 2: // Print owned courses
						Instructor.getInstructorCourses();
						break;
					case 3: // Add course
						System.out.println("Enter the course name: ");
						String crs1 = input.next();
						Instructor.addCourse(crs1);
						break;
					}
				} while (true);

			}
			while ("student".equals(userName) && "333".equals(password)) {
				System.out.println("Login successful");
				do {

					System.out.println("Student Page");
					System.out.println("Press 1 to Print Grades and Enrolled Courses");
					System.out.println("Press 2 to Add a Course");
					System.out.println("Press 3 to Drop a Course");
					System.out.println("Press 0 to exit the system");
					System.out.println("Select your desired operation please");
					int select = input.nextInt();
					switch (select) {

					case 1: // Print Courses
						Student.getGradesCourses(0);
						break;

					case 2: // Add a course
						System.out.println("Enter Course Name: ");
						String course = input.next();
						Student.enrollCourse(course);

						break;

					case 3: // Drop a course
						System.out.println("Enter Course Name: ");
						String course1 = input.next();
						Student.withdrawCourse(course1);
						break;

					case 0:

						System.exit(0);

						break;

					default:
						break;
					}
				} while (true);

			}
		} while (login);
		{
			login = true;
			System.out.println("Login failed please re-enter:");
		}
		while (login)
			;
	}
}
