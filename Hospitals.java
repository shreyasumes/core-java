class Hospitals {
	private String name;
	private String location;
	private int numDoctors;
	private int numDepartments;
	private char grade;
	static int numNurses;
	static String chiefName;

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
	public void setDoctors(int c) {
		numDoctors = c;
	}
	public int getDoctors() {
		return numDoctors;
	}
	public void setDepartments(int d) {
		numDepartments = d;
	}
	public int getDepartments() {
		return numDepartments;
	}
	public void setGrade(char e) {
		grade = e;
	}
	public char getGrade() {
		return grade;
	}
}
