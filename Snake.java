class Snake {
    private String name;
    

    public Snake() {
        System.out.println("No-argument constructor / default constructor");
        this.name = "viper";
    }

    public Snake(String name) {
        System.out.println("Parameterized constructor with one parameter");
        this.name = name;
    }

    public Snake(String name) {
        System.out.println("Parameterized constructor with two parameters");
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
