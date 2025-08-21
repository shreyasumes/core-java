class Vinyas
{ 	static String name="vinnu";
	static String company="yamuna";
	static float price=34454;
	static String colour="brown";
	static float milage=45;
public static void main(String args[])
{
	String Name=nameofBike();
	String Company=nameofCompany();
	float Price=priceofBike();
	String Colour=colourofBike();
	float Milage=milageofBike();
	System.out.println(Name);
	System.out.println(Company);
	System.out.println(Price);
	System.out.println(Colour);
	System.out.println(Milage);
}
public static String nameofBike()
{
	return name;
}
public static String nameofCompany()
{
	return company;
}
public static float priceofBike()
{
	return price;
}
public static String colourofBike()
{
	return colour;
}
public static float milageofBike()
{
	return milage;
}
}
	



