class Employee {
    static String department = "HR";
    static int employeeId = 5001;
    static double salary = 65000.50;

    public static void main(String[] args) {
        String department = "Finance";  // shadows static
        int employeeId = 9002;         // shadows static
        double salary = 75000.75;      // shadows static

        System.out.println("Local department: " + department);
        System.out.println("Local employee ID: " + employeeId);
        System.out.println("Local salary: " + salary);

        showDepartment();
        showEmployeeId();
        showSalary();
    }

    public static void showDepartment() {
        System.out.println("Static department: " + department);
    }

    public static void showEmployeeId() {
        System.out.println("Static employee ID: " + employeeId);
    }

    public static void showSalary() {
        System.out.println("Static salary: " + salary);
    }
}
