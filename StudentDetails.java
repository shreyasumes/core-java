class Studentdetails
{
    static char section = 'B';
    static int rollNumber = 101;
    static double percentage = 87.5;
    static char grade = 'A';
    static int year = 2025;

    public static void main(String args[])
    {
        char Section = getSection();
        int Roll = getRollNumber();
        double Percentage = getPercentage();
        char Grade = getGrade();
        int Year = getYear();

        System.out.println("Section: " + Section);
        System.out.println("Roll Number: " + Roll);
        System.out.println("Percentage: " + Percentage + "%");
        System.out.println("Grade: " + Grade);
        System.out.println("Year: " + Year);
    }

    public static char getSection()
    {
        return section;
    }

    public static int getRollNumber()
    {
        return rollNumber;
    }

    public static double getPercentage()
    {
        return percentage;
    }

    public static char getGrade()
    {
        return grade;
    }

    public static int getYear()
    {
        return year;
    }
}
