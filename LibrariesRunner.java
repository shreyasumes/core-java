class LibrariesRunner {
	public static void main(String[] args) {
		Libraries l1 = new Libraries();
		l1.setName("Central Library");
		System.out.println(l1.getName());

		l1.setLocation("Mysuru");
		System.out.println(l1.getLocation());

		l1.setBooks(10000);
		System.out.println(l1.getBooks());

		l1.setSections(8);
		System.out.println(l1.getSections());

		l1.setGrade('A');
		System.out.println(l1.getGrade());

		Libraries l2 = new Libraries();
		l2.setName("City Library");
		System.out.println(l2.getName());

		Libraries l3 = new Libraries();
		l3.setName("Town Library");
		System.out.println(l3.getName());

		Libraries l4 = new Libraries();
		l4.setName("District Library");
		System.out.println(l4.getName());

		Libraries l5 = new Libraries();
		l5.setName("Student Library");
		System.out.println(l5.getName());

		Libraries l6 = new Libraries();
		l6.setName("Tech Library");
		System.out.println(l6.getName());

		Libraries l7 = new Libraries();
		l7.setName("Research Library");
		System.out.println(l7.getName());

		Libraries l8 = new Libraries();
		l8.setName("Public Library");
		System.out.println(l8.getName());

		Libraries l9 = new Libraries();
		l9.setName("Digital Library");
		System.out.println(l9.getName());

		Libraries l10 = new Libraries();
		l10.setName("Community Library");
		System.out.println(l10.getName());

		Libraries.numLibrarians = 6;
		System.out.println(Libraries.numLibrarians);

		Libraries.headName = "Ms. Leela";
		System.out.println(Libraries.headName);
	}
}