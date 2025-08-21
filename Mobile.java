class Mobile {
    static String brand = "Samsung";
    static int price = 25000;

    public static void main(String[] args) {
        String Brand = getBrand();
        int Price = getPrice();

        System.out.println("Brand: " + Brand);
        System.out.println("Price: " + Price);
    }

    public static String getBrand() {
        return brand;
    }

    public static int getPrice() {
        return price;
    }
}
