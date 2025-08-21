class HospiitalRunner
{
	public static void main(String[] args)
	{
		
	 Hospiital[] hospitals=new Hospiital[2];
	 
	 Hospiital hospital=new Hospiital();
	 hospital.setName("jayadeva hospital");
	 hospital.setAddress("micro layout");
	 
	 
	 hospitals[0]=hospital;
	 
	 
	 Hospiital hospital1=new Hospiital();
	 hospital1.setName("NIMHAS ");
	 hospital1.setAddress("JPNAGAR ");
	 
	 hospitals[1]=hospital1;
	 
	 for(int i=0;i<hospitals.length;i++)
	 {
		//System.out.println("Hospital ========="+(i+1));
		Hospiital localHospital= hospitals[i];
		System.out.println(localHospital.getName());
		System.out.println(localHospital.getAddress());
	 }
}
}
	 