public class Day1_Basics {
    public static void main(String[] args) {
        // Variables and Data Types
        String topic = "100 Days of Java Code Challenge";
        int day = 1;
        double progressPercentage = 1.0;
        char status = 'A'; // A for Active
        boolean isCompleted = true;

        // Output Display
        System.out.println("==================================");
        System.out.println("  Welcome to " + topic);
        System.out.println("==================================");
        System.out.println("Day Status       : Day " + day);
        System.out.println("Challenge Status  : " + status);
        System.out.println("Completed Today? : " + isCompleted);
        System.out.println("Progress         : " + progressPercentage + "%");

        // Basic Math Operations
        int num1 = 25;
        int num2 = 5;
        
        System.out.println("\n--- Basic Math Calculation ---");
        System.out.println("Addition       (" + num1 + " + " + num2 + ") = " + (num1 + num2));
        System.out.println("Subtraction    (" + num1 + " - " + num2 + ") = " + (num1 - num2));
        System.out.println("Multiplication (" + num1 + " * " + num2 + ") = " + (num1 * num2));
        System.out.println("Division       (" + num1 + " / " + num2 + ") = " + (num1 / num2));
        System.out.println("Modulus        (" + num1 + " % " + num2 + ") = " + (num1 % num2));
        System.out.println("==================================");
    }
}

