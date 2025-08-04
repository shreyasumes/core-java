class Bike
{
	private String name;
	String model;
	
	public static void main(String[] args)
	{
		Bike bike=new Bike();
		bike.setName("starcity");
		System.out.println(bike.name);
	}
	public void setName(String nob)
	{
		nob=name;
	}
	public String getName()
	{
		return name;
	}
}