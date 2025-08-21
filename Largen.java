class Largen {
    public static void main(String args[]) {
        int a = 70;
        int b = 30;
        int c = 120;

        if (a > b && a > c) {
            System.out.println("A is greatest: " + a);
        } else if (b > a && b > c) {
            System.out.println("B is greatest: " + b);
        } else {
            System.out.println("C is greatest: " + c);
        }
    }
}
