class BirdRunner
{
	public static void main(String[] args)
	{
		Bird bird=new Bird();
		
		
		System.out.println(bird.getName());
		bird.setName("sparow");
		String name=bird.getName();
		System.out.println(name);
		
		
		System.out.println("=============================");
		Bird bird1=new Bird("sparrow");
		System.out.println(bird1.getName());
		
	}
	
}
		