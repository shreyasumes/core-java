public class PlanetRunner {
    public static void main(String[] args) {
        // Array of 5 Planet objects
        Planet[] planets = new Planet[5];

        Planet p1 = new Planet();
        p1.setName("Mercury");
        p1.setNumberOfMoons(0);
        planets[0] = p1;

        Planet p2 = new Planet();
        p2.setName("Earth");
        p2.setNumberOfMoons(1);
        planets[1] = p2;

        Planet p3 = new Planet();
        p3.setName("Mars");
        p3.setNumberOfMoons(2);
        planets[2] = p3;

        Planet p4 = new Planet();
        p4.setName("Jupiter");
        p4.setNumberOfMoons(92);
        planets[3] = p4;

        Planet p5 = new Planet();
        p5.setName("Saturn");
        p5.setNumberOfMoons(83);
        planets[4] = p5;

        // Display planet details
        for (Planet planet : planets) {
            System.out.println("Planet: " + planet.getName());
            System.out.println("Number of Moons: " + planet.getNumberOfMoons());
            System.out.println("----------");
        }
    }
}
