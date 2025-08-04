class CarRunner {
	public static void main(String[] args) {
		Carr c = new Carr("Toyota", "White");
		System.out.println("Brand: " + c.getBrand());
		System.out.println("Color: " + c.getColor());
		System.out.println("==================");
		c.setBrand("Hyundai");
		System.out.println("Brand: " + c.getBrand());
		c.setColor("Black");
		System.out.println("Color: " + c.getColor());
	}
}