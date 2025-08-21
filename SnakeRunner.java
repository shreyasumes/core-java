class SnakeRunner {
    public static void main(String[] args) {
        Snake snake= new Snake();
        System.out.println(Snake.getName());  

        snake.setName("sparow");
        String name = snake.getName();
        System.out.println(name);           


    }
}
