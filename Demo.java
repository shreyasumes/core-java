class Demo {
    static String topic = "physics";
    static String module = "quantum";
    static int id = 101;
    static double score = 9.23;

    public static void main(String[] args) {
        String topic = "chemistry";
        String module = "organic";
        int id = 202;
        double score = 8.45;

        System.out.println(topic);   
        System.out.println(module);
        System.out.println(id);     
        System.out.println(score);  

        printTopic();   
        printModule();  
        printId();     
        printScore();   
    }

    public static void printTopic() {
        System.out.println(topic);
    }

    public static void printModule() {
        System.out.println(module);
    }

    public static void printId() {
        System.out.println(id);
    }

    public static void printScore() {
        System.out.println(score);
    }
}
