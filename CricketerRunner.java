public class CricketerRunner {
    public static void main(String[] args) {
        // Array of 5 Cricketer objects
        Cricketer[] players = new Cricketer[5];

        Cricketer p1 = new Cricketer();
        p1.setName("Virat Kohli");
        p1.setTeam("India");
        players[0] = p1;

        Cricketer p2 = new Cricketer();
        p2.setName("Steve Smith");
        p2.setTeam("Australia");
        players[1] = p2;

        Cricketer p3 = new Cricketer();
        p3.setName("Joe Root");
        p3.setTeam("England");
        players[2] = p3;

        Cricketer p4 = new Cricketer();
        p4.setName("Kane Williamson");
        p4.setTeam("New Zealand");
        players[3] = p4;

        Cricketer p5 = new Cricketer();
        p5.setName("Babar Azam");
        p5.setTeam("Pakistan");
        players[4] = p5;

        // Display all players
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player: " + players[i].getName());
            System.out.println("Team: " + players[i].getTeam());
            System.out.println("----------");
        }
    }
}
