class Average
{
	public static void main(String [] args)
	{
		int[] number={10,20,30,40,50};
		float average=averageofArrayNumbers(numbers);
		System.out.println(average);
	}
	public static float averageofArrayNumbers(int[] numbers)
	{
		int sum=0;
		for(int i=0;i<numbers.length;i++)
		{
			sum=sum+numbers[i];
		}
		System.out.println(sum);
		float average=sum/numbers.length;
		return average;
	}
}