class Person{
	String name;
	int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

		
	public static void main(String[] args){
		Person p = new Person("Kartik",22);
		System.out.println("Name:" + p.name);
		System.out.println("Age:" + p.age);
		
		p.validateEligibleforVoting();
		
	}
	public  void validateEligibleforVoting(){
		if(this.age>18){
			System.out.println("Eligible for Voting");
		}
		else if(this.age<18){
			System.out.println("Not Eligible for voting");
		}
		else{
			System.out.println("Invalid age");
		}
	}
	
}