public class Grade {

    private String name;
    private int reg;
    private int[] grade = new int[3];

    public Grade(String name, int reg, int[] numerofsubjects) {
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
        return "Name           : " + name + 
        " \n Registration No : " + reg +
         "\n Average         : " + average() ;
    }

    public static void main(String[] args) {

        Grade[] c = new Grade[5];

        c[0] = new Grade("Farhan", 101, new int[]{98, 99, 89});
        c[2] = new Grade("Ali", 103, new int[]{98, 99, 79});
        c[4] = new Grade("Ahmad", 105, new int[]{88, 99, 89});

        for (int i = 0; i < c.length; i++) {
            if (c[i] != null) {
                System.out.println("\n Slot " + i + ":\n " + c[i]);
                 System.out.println("\n-----------------------");
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
        System.out.println(" ");
        System.out.println(" Topper index is " + topperIndex);
        System.out.println(" Topper record\n " + c[topperIndex]);
    }
}