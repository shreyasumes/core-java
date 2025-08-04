class Bag
{
	public static void main(String[] args)
	{
		String[] company={"hexa","zeva","raman"};
		float[] point={10.0f,22.0f,13.08f,15.0f};
		char[] review={'a','b','d','e','f'};
		double[] price={55555555.00,625.00,89.000};
		long[] serialNO={122222222222222L,233344555666L,65445645665L,665554544L};
	
		for(int i=0;i<company.length;i++)
		{
			System.out.println(company[i]);
		}
		for(int i=0;i<point.length;i++)
		{
			System.out.println(point[i]);
		}
		for(int i=0;i<review.length;i++)
		{
			System.out.println(review[i]);
		}
		for(int i=0;i<price.length;i++)
		{
			System.out.println(price[i]);
		}
		for(int i=0;i<serialNO.length;i++)
		{
			System.out.println(serialNO[i]);
		}
		
	}
	
}