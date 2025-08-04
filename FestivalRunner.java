public class FestivalRunner {
    public static void main(String[] args) {
        Festival[] festivals = new Festival[5];

        Festival f1 = new Festival();
        f1.setName("Diwali");
        f1.setMonth("November");
        festivals[0] = f1;

        Festival f2 = new Festival();
        f2.setName("Holi");
        f2.setMonth("March");
        festivals[1] = f2;

        Festival f3 = new Festival();
        f3.setName("Christmas");
        f3.setMonth("December");
        festivals[2] = f3;

        Festival f4 = new Festival();
        f4.setName("Eid");
        f4.setMonth("April");
        festivals[3] = f4;

        Festival f5 = new Festival();
        f5.setName("Pongal");
        f5.setMonth("January");
        festivals[4] = f5;

        for (int i = 0; i < festivals.length; i++) {
            Festival fest = festivals[i];
            System.out.println("Festival: " + fest.getName());
            System.out.println("Month: " + fest.getMonth());
            System.out.println("----------");
        }
    }
}
