class Boook{
	private String name;
	String publisher;
	
	
	
	public static void main(String[] args){
		Boook book = new Boook();
		
		book.setName("Java");
		System.out.println(book.name);
		
		
	}
	public void setName(String nob){
		name = nob;
	}
	public String getName(){
		return name;
	}
	
}