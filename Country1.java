class Country1
{
	private String name;
	private int noofstates;
	private State[] states;
	private String primeminister;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String setName()
	{
		return name;
	}
	public void getName(State[] states)
	{
		this.states=states;
	}
	public State[] getState()
	{
		return states;
	}
	public void setPrimeminister(String primeminister)
	{
		this.primeminister=primeminister;
	}
	public String getPrimeminister()
	{
		return primeminister;
	}
	public void setnofstates(int noofstates)
	{
		this.noofstates=noofstates;
	}
	public int getnoofstates()
	{
		return noofstates;
	}
}