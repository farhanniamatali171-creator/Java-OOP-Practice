public class StudentGrade {

    private String name;
    private int reg;
    private int[] grade = new int[3];

    public StudentGrade(String name, int reg, int[] numerofsubjects) {
        this.name = name;
        this.reg = reg;
        this.grade = numerofsubjects;
    }

    public void setGrade(int subjects, int score) {
        grade[subjects] = score;
    }

    public double average() {
        int sum = 0;
        for (int i = 0; i < grade.length; i++) {
            sum += grade[i];
        }
        return (double) sum / grade.length;
    }

    @Override
    public String toString() {
        return "Student (Name:" + name + " , Registration Number=" + reg + " , Average=" + average() + ")";
    }

    public static void main(String[] args) {

        StudentGrade[] c = new StudentGrade[5];

        c[0] = new StudentGrade("Farhan", 101, new int[]{98, 99, 89});
        c[2] = new StudentGrade("Ali", 103, new int[]{98, 99, 79});
        c[4] = new StudentGrade("Ahmad", 105, new int[]{88, 99, 89});

        for (int i = 0; i < c.length; i++) {
            if (c[i] != null) {
                System.out.println("Slot " + i + ": " + c[i]);
            } else {
                System.out.println("Slot " + i + ": Empty");
            }
        }

        int topperIndex = -1;

        for (int i = 0; i < c.length; i++) {
            if (c[i] != null) {
                if (topperIndex == -1 || c[i].average() > c[topperIndex].average()) {
                    topperIndex = i;
                }
            }
        }

        System.out.println("Topper index  : " + topperIndex);
        System.out.println("Topper record : " + c[topperIndex]);
    }
}