class Laptop
{
	String name;
	float price;
	int storage;
		public Laptop(){
		}
		public static void main(String[] args)
		{
		Laptop laptop=new Laptop();
		laptop.name="lenovo";
		System.out.println(laptop.name);
		laptop.setName("hp");
		System.out.println(laptop.name);
		Laptop laptop1=new Laptop();
		//laptop1.setNmae="dell";
		laptop1.setName("dell");
		System.out.println(laptop1.name);
		System.out.println(laptop.name);
		}
		public void setName(String LaptopName)
		{
			name=LaptopName;
		}
	
	}
	