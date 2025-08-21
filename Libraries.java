class Libraries {
	private String name;
	private String location;
	private int numBooks;
	private int numSections;
	private char grade;
	static int numLibrarians;
	static String headName;

	public void setName(String a) {
		name = a;
	}
	public String getName() {
		return name;
	}
	public void setLocation(String b) {
		location = b;
	}
	public String getLocation() {
		return location;
	}
	public void setBooks(int c) {
		numBooks = c;
	}
	public int getBooks() {
		return numBooks;
	}
	public void setSections(int d) {
		numSections = d;
	}
	public int getSections() {
		return numSections;
	}
	public void setGrade(char e) {
		grade = e;
	}
	public char getGrade() {
		return grade;
	}
}