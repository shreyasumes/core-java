class TRunner
{
	public static  void main(String[] args)
	{
		Temple temple=new Temple();
		//private non static variable
		temple.setname("thirupathi");
		System.out.println(temple.getname());
		Temple temple=new Temple();
		temple.setadd("andra");
		System.out.println(temple.getadd());
		Temple temple=new Temple();
		temple.setkal("bramakalasha");
		System.out.println(temple.getkal());
		
		//non-private non static variable
		//temple.name = "Ganesha";
		//System.out.println(temple.name);
		//static variable
		Temple temple=new Temple();
		temple.collection=1233;
		Temple.temple=new Temple();
		temple.pincode=23333;
		temple.steps=11111;
		System.out.println(temple.steps);
		Temple.prasadam = "ghee";
		System.out.println(Temple.prasadam);
		
	}
}
