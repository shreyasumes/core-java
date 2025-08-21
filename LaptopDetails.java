class LaptopDetails {
    public static void main(String[] args) {
        String[] brand = {"HP", "Dell", "Lenovo", "Asus", "Acer", "Apple", "MSI", "Samsung", "LG", "Sony"};
        int[] ram = {8, 16, 8, 16, 4, 8, 16, 8, 8, 4};
        float[] screen = {14.0f, 15.6f, 13.3f, 14.5f, 15.0f, 13.0f, 15.6f, 14.0f, 16.0f, 15.0f};
        char[] grade = {'A','A','B','A','B','S','A','B','A','B'};
        double[] price = {55000.0, 60000.0, 48000.0, 62000.0, 39000.0, 95000.0, 70000.0, 50000.0, 64000.0, 45000.0};
        long[] serialNo = {111222333L, 222333444L, 333444555L, 444555666L, 555666777L, 666777888L, 777888999L, 888999000L, 999000111L, 100200300L};

        for(int i = 0; i < brand.length; i++) {
            System.out.println(brand[i]);
        }
        for(int i = 0; i < ram.length; i++) {
            System.out.println(ram[i]);
        }
        for(int i = 0; i < screen.length; i++) {
            System.out.println(screen[i]);
        }
        for(int i = 0; i < grade.length; i++) {
            System.out.println(grade[i]);
        }
        for(int i = 0; i < price.length; i++) {
            System.out.println(price[i]);
        }
        for(int i = 0; i < serialNo.length; i++) {
            System.out.println(serialNo[i]);
        }
    }
}
 