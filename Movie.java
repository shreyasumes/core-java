class Movie {
	String title;
	String director;
	float rating;
	
	Movie() {
		this.title = title;
		this.director = director;
		this.rating = rating;
	}
	
	Movie(String title, String director, float rating) {
		this.title = title;
		this.director = director;
		this.rating = rating;
	}
	
	public void setDetails(String title, String director, float rating) {
		this.title = title;
		this.director = director;
		this.rating = rating;
	}
	
	public String getTitle() {
		return title;
	}
	public String getDirector() {
		return director;
	}
	public float getRating() {
		return rating;
	}
}

class MovieRunner {
	public static void main(String[] args) {
		Movie m1 = new Movie();
		m1.setDetails("Inception", "Christopher Nolan", 8.8f);
		System.out.println("Title: " + m1.getTitle());
		System.out.println("Director: " + m1.getDirector());
		System.out.println("Rating: " + m1.getRating());
		
		Movie m2 = new Movie();
		m2.setDetails("Shutter Island", "Martin Scorsese", 8.2f);
		System.out.println("Title: " + m2.getTitle());
		System.out.println("Director: " + m2.getDirector());
		System.out.println("Rating: " + m2.getRating());
		
		Movie m3 = new Movie("Interstellar", "Christopher Nolan", 8.6f);
		System.out.println("Title: " + m3.getTitle());
		System.out.println("Director: " + m3.getDirector());
		System.out.println("Rating: " + m3.getRating());
		
		Movie m4 = new Movie("The Dark Knight", "Christopher Nolan", 9.0f);
		System.out.println("Title: " + m4.getTitle());
		System.out.println("Director: " + m4.getDirector());
		System.out.println("Rating: " + m4.getRating());
		
		Movie m5 = new Movie("The Prestige", "Christopher Nolan", 8.5f);
		System.out.println("Title: " + m5.getTitle());
		System.out.println("Director: " + m5.getDirector());
		System.out.println("Rating: " + m5.getRating());
	}
}
