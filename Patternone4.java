class Patternone4
{
	public static void main(String[] args)
	{
		int rows=2;
		int column=8;
		for(int i=0;i<rows;i++)
		{ 
			
			for(int j=1;j<column;j++)
			{
				if(j%2!=0)
				{
				
				System.out.print(j);
				}
				else
				{
					System.out.print(" ");
					
				}
			}
			    System.out.println("");
		}
	
	}
}