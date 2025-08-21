class AnimalRunner {
    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a.getName()); 
        a.setName("lion");
        String name = a.getName();
        System.out.println(name); 
    }
}
