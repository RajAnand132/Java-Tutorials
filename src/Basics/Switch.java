package Basics;

public class Switch {
    public static void main(String[] args) {
        // Switch
        int a = 15;
        int b = 6;

        int dayOfWeek = 5; // Let's assume 1=Monday, 2=Tuesday, etc.

        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                if(a > b)
                    System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

        // Nested Switch

        int timeOfDay = 1; // 24-hour format

        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");

                // Nested switch
                switch (timeOfDay) {
                    case 0: case 1: case 2: case 3: case 4:
                        System.out.println("Early morning");
                        break;
                    case 5: case 6: case 7: case 8: case 9:
                        System.out.println("Morning");
                        break;
                    case 10: case 11: case 12: case 13: case 14:
                        System.out.println("Afternoon");
                        break;
                    case 15: case 16: case 17: case 18: case 19:
                        System.out.println("Evening");
                        break;
                    case 20: case 21: case 22: case 23:
                        System.out.println("Night");
                        break;
                    default:
                        System.out.println("Invalid time");
                        break;
                }
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
