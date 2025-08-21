public class FruitRunner {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[5];

        Fruit f1 = new Fruit();
        f1.setName("Apple");
        f1.setColor("Red");
        fruits[0] = f1;

        Fruit f2 = new Fruit();
        f2.setName("Banana");
        f2.setColor("Yellow");
        fruits[1] = f2;

        Fruit f3 = new Fruit();
        f3.setName("Grapes");
        f3.setColor("Green");
        fruits[2] = f3;

        Fruit f4 = new Fruit();
        f4.setName("Orange");
        f4.setColor("Orange");
        fruits[3] = f4;

        Fruit f5 = new Fruit();
        f5.setName("Blueberry");
        f5.setColor("Blue");
        fruits[4] = f5;

        for (int i = 0; i < fruits.length; i++) {
            Fruit fr = fruits[i];
            System.out.println("Fruit: " + fr.getName());
            System.out.println("Color: " + fr.getColor());
            System.out.println("----------");
        }
    }
}
