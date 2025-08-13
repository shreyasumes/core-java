public class Switch {
    public static void main(String[] args) {
        numberSwitch(2);
        daySwitch("Tuesday");
        gradeSwitch('A');
        monthSwitch(8);
        colorSwitch("Red");
    }

    public static void numberSwitch(int num) {
        switch (num) {
            case 1:
                System.out.println("Number is One");
                break;
            case 2:
                System.out.println("Number is Two");
                break;
            case 3:
                System.out.println("Number is Three");
                break;
            default:
                System.out.println("Number is not 1, 2, or 3");
        }
    }


    public static void daySwitch(String day) {
        switch (day) {
            case "Monday":
                System.out.println("Start of the week");
                break;
            case "Friday":
                System.out.println("Almost weekend!");
                break;
            case "Sunday":
                System.out.println("Weekend chill");
                break;
            default:
                System.out.println("Regular weekday");
        }
    }

    
    public static void gradeSwitch(char grade) {
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good Job");
                break;
            case 'C':
                System.out.println("Well Done");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }

    public static void monthSwitch(int month) {
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 8:
                System.out.println("August");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Not a special month");
        }
    }

   
    public static void colorSwitch(String color) {
        switch (color) {
            case "Red":
                System.out.println("Color of energy");
                break;
            case "Blue":
                System.out.println("Color of peace");
                break;
            case "Green":
                System.out.println("Color of nature");
                break;
            default:
                System.out.println("Unknown color");
        }
    }
}