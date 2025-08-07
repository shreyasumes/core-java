class TableArray1
{
	public static void main(String[] args)
	{
	 int[] four =  new int[10];
	 
	 for(int i=0;i<four.length;i++)
	 {
		four[i] = 4 * (i+1);
	}
	 for(int i=1;i<=four.length;i++)
	 {
		four[i-1] = 4 * (i);
	 }
	
	System.out.println("3 multiplication");
	for(int i=0;i<four.length;i++)
	{
		System.out.println(four[i]);
	}
	}
}