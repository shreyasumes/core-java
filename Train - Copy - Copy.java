class Train {
	private String name;
	private int cost;
	private int speed;

	public static int length;

	// Static block
	static {
		System.out.println("static block in train");
		length = 100;
	}

	// Non-static block
	{
		System.out.println("non static block in train");
		length = 200;
	}

	public void setName(String TrainName) {
		name = TrainName;
	}

	public String getName() {
		return name;
	}

	public void setCost(int trainCost) {
		cost = trainCost;
	}

	public int getCost() {
		return cost;
	}
}
