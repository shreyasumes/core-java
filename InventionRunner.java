public class InventionRunner {
    public static void main(String[] args) {
        Invention[] inventions = new Invention[5];

        Invention i1 = new Invention();
        i1.setInvention("Telephone");
        i1.setInventor("Alexander Graham Bell");
        inventions[0] = i1;

        Invention i2 = new Invention();
        i2.setInvention("Light Bulb");
        i2.setInventor("Thomas Edison");
        inventions[1] = i2;

        Invention i3 = new Invention();
        i3.setInvention("Aeroplane");
        i3.setInventor("Wright Brothers");
        inventions[2] = i3;

        Invention i4 = new Invention();
        i4.setInvention("Computer");
        i4.setInventor("Charles Babbage");
        inventions[3] = i4;

        Invention i5 = new Invention();
        i5.setInvention("World Wide Web");
        i5.setInventor("Tim Berners-Lee");
        inventions[4] = i5;

        for (int i = 0; i < inventions.length; i++) {
            Invention inv = inventions[i];
            System.out.println("Invention: " + inv.getInvention());
            System.out.println("Inventor: " + inv.getInventor());
            System.out.println("----------");
        }
    }
}
