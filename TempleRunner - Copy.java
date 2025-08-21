class TempleRunner
{ 
	public static void main(String[] args)
	{
		Templle[] temples=new Templle[5];
		
		Templle t1 =  new Templle();
		t1.setName("rajmohan");
		t1.setAddress("rajijinagar");
		
		//temples[0]=t1;
		
		Templle t2 =  new Templle();
		t2.setName("charani");
		t2.setAddress("jpnagar");
		
		//temples[1]=t2;
		
		for(int i=0;i<temples.length;i++)
		{
			if(i==0)
			{
				temples[i]=t1;
			}
			else if(i==1)
			{
				temples[i]= t2;
			}
		}
		
		for(int i=0;i<temples.length;i++)
		{
			Templle temple = temples[i];
			if(temple != null)
			{
				System.out.println(temple.getName());
				System.out.println(temple.getAddress());
				
			}
			
			//if(temples[i]!= null)
			//{
			//	System.out.println("temple name"+temples[i].getName());
			//	System.out.println("temple address"+ temples[i].getAddress());
				
			//}
		}
	}		
}
			
		
		
		
		
		
		
