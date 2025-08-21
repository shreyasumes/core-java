class HospitalsRunner {
	public static void main(String[] args) {
		Hospitals h1 = new Hospitals();
		h1.setName("Central Hospital");
		System.out.println(h1.getName());

		h1.setLocation("Mysuru");
		System.out.println(h1.getLocation());

		h1.setDoctors(200);
		System.out.println(h1.getDoctors());

		h1.setDepartments(10);
		System.out.println(h1.getDepartments());

		h1.setGrade('A');
		System.out.println(h1.getGrade());

		Hospitals h2 = new Hospitals();
		h2.setName("City Hospital");
		System.out.println(h2.getName());

		Hospitals h3 = new Hospitals();
		h3.setName("Town Hospital");
		System.out.println(h3.getName());

		Hospitals h4 = new Hospitals();
		h4.setName("District Hospital");
		System.out.println(h4.getName());

		Hospitals h5 = new Hospitals();
		h5.setName("Student Health Center");
		System.out.println(h5.getName());

		Hospitals h6 = new Hospitals();
		h6.setName("Tech Hospital");
		System.out.println(h6.getName());

		Hospitals h7 = new Hospitals();
		h7.setName("Research Hospital");
		System.out.println(h7.getName());

		Hospitals h8 = new Hospitals();
		h8.setName("Public Health Hospital");
		System.out.println(h8.getName());

		Hospitals h9 = new Hospitals();
		h9.setName("Digital Health Center");
		System.out.println(h9.getName());

		Hospitals h10 = new Hospitals();
		h10.setName("Community Hospital");
		System.out.println(h10.getName());

		Hospitals.numNurses = 120;
		System.out.println(Hospitals.numNurses);

		Hospitals.chiefName = "Dr. Leela";
		System.out.println(Hospitals.chiefName);
	}
}
