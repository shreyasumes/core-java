class Company
{
		private String name;
		private long id;
		private String city;
		private int numberofEmployess;
		
  public Company()
    {
    }

  public Company(String name,long id)
  {
	  System.out.print("initializing name,id");
		this.name=name;
		this.id= id;
  }
  public Company(String name,long id,String city)
  {
	  this(name,id);
	  System.out.println("initalizing city");
	  this.city = city;
  }
  public Company(String name,long id, String city,int employess)
  {
	  this(name,id,city);
	  System.out.println("initalizing employess");
	  this.numberofEmployess= employess;
  }
  public String getName()
  {
	  return name;
  }
  public long getid()
  {
	  return id;
  }
  public String getCity()
  {
	  return city;
  }
  public int getEmployess()
  {
	  return numberofEmployess;
  }
}