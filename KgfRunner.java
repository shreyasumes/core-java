class KgfRunner {
    public static void main(String[] args) {
        // Declare an array of Kgf objects with 4 elements
        Kgf[] kgf = new Kgf[4];

        // First object
        Kgf kgff1 = new Kgf();
        kgff1.setHero("Yash");
        kgff1.setVillan("Garuda");
        kgf[0] = kgff1;

        // Second object
        Kgf kgff2 = new Kgf();
        kgff2.setHero("Yash");
        kgff2.setVillan("Adheera");
        kgf[1] = kgff2;

        // Third object
        Kgf kgff3 = new Kgf();
        kgff3.setHero("Yash");
        kgff3.setVillan("Suryavardhan");
        kgf[2] = kgff3;

        // Fourth object
        Kgf kgff4 = new Kgf();
        kgff4.setHero("Yash");
        kgff4.setVillan("Ramika Sen");
        kgf[3] = kgff4;

        // Print all details
        for (int i = 0; i < kgf.length; i++) {
            Kgf localkgf = kgf[i];
            System.out.println("Hero: " + localkgf.getHero());
            System.out.println("Villan: " + localkgf.getVillan());
            System.out.println("----------");
        }
    }
}
