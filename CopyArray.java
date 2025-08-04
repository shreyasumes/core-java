class CopyArray {
    public static void main(String[] args) {
        int[] ages = new int[4];

        // Initialize the array
        for (int i = 0; i < ages.length; i++) {
            ages[i] = i + (20 * i);
        }

        // Print original array
        System.out.println("Before copying into another array ");
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }

        // Copy into another array
        int[] copyArray = new int[ages.length];
        for (int i = 0; i < ages.length; i++) {
            copyArray[i] = ages[i];
        }

        // Print copied array
        System.out.println("Copied array ");
        for (int i = 0; i < copyArray.length; i++) {
            System.out.println( copyArray[i]);
        }
    }
}
