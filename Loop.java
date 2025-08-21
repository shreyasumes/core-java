public class Loop {
    public static void main(String[] args) {
        System.out.println("Using for loop:");
        for (int i = 1; i <= 100; i++) {
            classifyGrade(i);
        }

        System.out.println("\nUsing while loop:");
        int i = 1;
        while (i <= 100) {
            classifyGrade(i);
            i++;
        }

        System.out.println("\nUsing do-while loop:");
        i = 1;
        do {
            classifyGrade(i);
            i++;
        } while (i <= 100);
    }

    public static void classifyGrade(int marks) {
        if (marks > 90) {
            System.out.println("A grade: " + marks);
        } else if (marks > 80) {
            System.out.println("B grade: " + marks);
        } else if (marks > 70) {
            System.out.println("C grade: " + marks);
        } else {
            System.out.println("Not passed: " + marks);
        }
    }
}
