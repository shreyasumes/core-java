 class Carr {
	String brand;
	String color;

	public Carr(String brand, String color) {
		this.brand = brand;
		this.color = color;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}
}
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