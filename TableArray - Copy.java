class TableArray
{
	public static void main(String[] args)
	{
		int[] threetable= new int[10];
			
		for(int i=0;i<threetable.length;i++)
		{
				threetable[i] = 3*(i+1);
		}
	//	for(int i=1;i<threetable.length;i++)
	// {
	//			threetable[i-1] = 3*i;
	//	}
		System.out.println("3's multiplication table");
		for(int i=0;i<threetable.length;i++)
		{
			System.out.println(threetable[i]);
		}
	}
}

			
				
				
				