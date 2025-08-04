class AppRunner {
	public static void main(String[] args) {
		App a = new App("Instagram", "Meta");
		System.out.println("App Name: " + a.getName());
		System.out.println("Developer: " + a.getDeveloper());
		System.out.println("==================");
		a.setName("ChatGPT");
		a.setDeveloper("OpenAI");
		System.out.println("App Name: " + a.getName());
		System.out.println("Developer: " + a.getDeveloper());
	}
}