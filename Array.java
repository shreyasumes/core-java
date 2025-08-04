class Array {
    public static void main(String[] args) {
        int employeesId[] = new int[5];

        // Printing array reference
        System.out.println(employeesId);  // prints memory address

        // Printing default values (should be 0)
        for (int i = 0; i < employeesId.length; i++) {
            System.out.println(employeesId[i]);
        }

        // Setting and printing specific values
        employeesId[0] = 1;
        System.out.println(employeesId[0]);  // Output: 1
        System.out.println(employeesId[1]);  // Output: 0

        // Filling array with values from 10 to 14
        for (int i = 0; i < employeesId.length; i++) {
            employeesId[i] = i + 10;
        }

        // Overwriting 1st and 2nd index values repeatedly (redundant loop)
        for (int i = 0; i < employeesId.length; i++) {
            employeesId[1] = 2;
            employeesId[2] = 3;
        }

        // Final print to see updated array
        for (int i = 0; i < employeesId.length; i++) {
            System.out.println("employeesId[" + i + "] = " + employeesId[i]);
        }
    }
}
