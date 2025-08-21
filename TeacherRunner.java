class TeacherRunner {
	public static void main(String[] args) {
		Teacher t = new Teacher("Mrs. Kavitha", "Mathematics");
		System.out.println("Name: " + t.getName());
		System.out.println("Subject: " + t.getSubject());
		System.out.println("==================");
		t.setName("Mr. Ramesh");
		System.out.println("Name: " + t.getName());
		t.setSubject("Science");
		System.out.println("Subject: " + t.getSubject());
	}
}