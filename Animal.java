class Animal
{
	private  String name;
	private int age;
	private String colour;
	
	public Animal() {
        System.out.println("No-argument constructor / default constructor");
        this.name = "chethah";
		
	}	
	 public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

	