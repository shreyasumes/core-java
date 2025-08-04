class BigcatsRunner1{
    public static void main(String[] args) {
        Bigcats[] bigcats = new Bigcats[5];

        Bigcats b1 = new Bigcats();
        b1.setName("cheetah");
        b1.setColour("white with black dots");

        Bigcats b2 = new Bigcats();
        b2.setName("tiger");
        b2.setColour("red and white");

        Bigcats b3 = new Bigcats();
        b3.setName("lynx");
        b3.setColour("grey");

        Bigcats b4 = new Bigcats();
        b4.setName("black jaguar");
        b4.setColour("black with black dots");

        Bigcats b5 = new Bigcats();
        b5.setName("cheetah");
        b5.setColour("white with black dots");

        
        for (int i = 0; i < bigcats.length; i++) {
            if (i == 0) {
                bigcats[i] = b1;
            } else if (i == 1) {
                bigcats[i] = b2;
            } else if (i == 2) {
                bigcats[i] = b3;
            } else if (i == 3) {
                bigcats[i] = b4;
            } else if (i == 4) {
                bigcats[i] = b5;
            }
        }

        
        for (int i = 0; i < bigcats.length; i++) {
            Bigcats bigcatsFinal = bigcats[i];
            if (bigcatsFinal != null) {
                System.out.println("Name: " + bigcatsFinal.getName());
                System.out.println("Colour: " + bigcatsFinal.getColour());
                System.out.println("--------------------------");
            }
        }
    }
}
