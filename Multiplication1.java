class Multiplication1{
	public static void main(String[] args){
		for(int i=1;i<=100;i++){
			if(i%2==0){
				System.out.println("Even Number is:" +i);
			}
			if(i%2!=0){
				System.out.println("Odd Number is:" +i);
			}
			if(i%3==0){
				System.out.println("Divisible by 3 is:" +i);
			}
			if(i%5==0){
				System.out.println("Divisible by 5 is:" +i);
			}
			System.out.println("---------------------------");
		}
	}
}