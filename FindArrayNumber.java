class FindArrayNumber {
    public static void main(String[] args) {
        int array[] = {10, 20, 30, 40, 70};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        int number = 20;  // corrected variable declaration and spelling
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println("Element " + number + " found at index " + i);
            }
        }
    }
}
