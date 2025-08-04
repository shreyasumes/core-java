public class Bicycle {
    static String brand;
    static int gearCount = 5;
    static boolean isAvailable;

    public static void main(String[] args) {
        String brand = "";
        System.out.println(Bicycle.brand); 
        System.out.println("brand: " + brand);  
        brand = "Hero";
        System.out.println("brand: " + brand); 
        System.out.println(gearCount); 
        ride(); 
        Bicycle.ride(); 
    }

    public static void ride() {
        System.out.println("The bicycle has " + gearCount + " gears.");
    }
}
