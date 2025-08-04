class Bird {
    private String name;
    private int age;

    public Bird() {
        System.out.println("No-argument constructor / default constructor");
        this.name = "pigion";
    }

    public Bird(String name) {
        System.out.println("Parameterized constructor with one parameter");
        this.name = name;
    }

    public Bird(String name, int age) {
        System.out.println("Parameterized constructor with two parameters");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
