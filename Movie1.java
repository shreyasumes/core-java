class Movie1 {
    String name;
    String director;

    public static void main(String[] args) {
        
        Movie movie1 = new Movie();
        movie1.name = "Dangal";
        movie1.director = "Nitesh Tiwari";
        System.out.println("Movie 1:");
        System.out.println("Name: " + movie1.name);
        System.out.println("Director: " + movie1.director);

       
        Movie movie2 = new Movie();
        movie2.setMovie("3 Idiots", "Rajkumar Hirani");
        System.out.println("Movie 2:");
        System.out.println("Name: " + movie2.name);
        System.out.println("Director: " + movie2.director);
    }

    public void setMovie(String n, String d) {
        name = n;
        director = d;
    }
}
