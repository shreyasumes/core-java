
class Students {
    public static void main(String[] args) {
        String name = "Ravi";
        int marks = 82;

        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);

        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A+ (Excellent)");
        } else if (marks >= 75 && marks < 90) {
            System.out.println("Grade: A (Very Good)");
        } else if (marks >= 60 && marks < 75) {
            System.out.println("Grade: B (Good)");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("Grade: C (Average)");
        } else if (marks >= 35 && marks < 50) {
            System.out.println("Grade: D (Pass)");
        } else if (marks >= 0 && marks < 35) {
            System.out.println("Grade: F (Fail)");
        } else {
            System.out.println("Invalid marks!");
        }
    }
}
