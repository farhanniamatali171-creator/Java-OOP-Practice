class StudentManagement {

    static String universityName = "COMSATS";
    static String courseName = "Object Oriented Programming";
    static int studentCount = 0;
    String name;
    int rollNo;
    double marks;
    final int MAX_MARKS = 100;
    final int PASSING_MARKS = 50;
   StudentManagement(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        studentCount++;
    }
    void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("Course: " + courseName);
        System.out.println("University: " + universityName);
        System.out.println("----------------------");
    }

    static void displayUniversity() {
        System.out.println("University: " + universityName);
        System.out.println("Total Students: " + studentCount);
    }
    static void changeUniversityName(String newName) {
        universityName = newName;
    }
    final void showMaxMarks() {
        System.out.println("Max Marks: " + MAX_MARKS);
        System.out.println("Passing Marks: " + PASSING_MARKS);
    }
	   public static void main(String[] args) {
        StudentManagement s1 = new StudentManagement("Farhan", 101, 95);
        StudentManagement s2 = new StudentManagement("Ahmed", 102, 85);
        StudentManagement s3 = new StudentManagement("Ali", 103, 75);
        s1.displayStudentInfo();
        s2.displayStudentInfo();
        s3.displayStudentInfo();
        StudentManagement.displayUniversity();
		StudentManagement.changeUniversityName("FAST University");
        System.out.println("\nAfter Changing University Name:");
        StudentManagement.displayUniversity();
        s1.showMaxMarks();
    }
}