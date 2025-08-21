class SongRunner {
	public static void main(String[] args) {
		Song s = new Song("Tum Hi Ho", "Arijit Singh");
		System.out.println("Title: " + s.getTitle());
		System.out.println("Singer: " + s.getSinger());
		System.out.println("==================");
		s.setTitle("Kesariya");
		s.setSinger("Arijit Singh");
		System.out.println("Title: " + s.getTitle());
		System.out.println("Singer: " + s.getSinger());
	}
}