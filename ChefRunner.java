class ChefRunner {
	public static void main(String[] args) {
		Chef c = new Chef("Sanjeev Kapoor", "Indian Cuisine");
		System.out.println("Chef Name: " + c.getName());
		System.out.println("Speciality: " + c.getSpeciality());
		System.out.println("==================");
		c.setName("Gordon Ramsay");
		c.setSpeciality("British Cuisine");
		System.out.println("Chef Name: " + c.getName());
		System.out.println("Speciality: " + c.getSpeciality());
	}
}
