import java.util.Scanner;

    public class BMindex {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("BMI Calculator");

            System.out.print("Enter your height (in meters): ");
            float height = scanner.nextFloat();


            System.out.print("Enter your weight (in kilograms): ");
            float weight = scanner.nextFloat();


            float bmi = calculateBMI(weight, height);


            System.out.println("Your BMI is: " + bmi);


            interpretBMI(bmi);

            scanner.close();
        }

        public static float calculateBMI(float weight, float height) {
            return weight / (float)Math.pow(height, 2);
        }

        public static void interpretBMI(float bmi) {
            if (bmi < 18.5) {
                System.out.println("You are underweight.");
            } else if (bmi >= 18.5 && bmi < 24.9) {
                System.out.println("Your weight is normal.");
            } else if (bmi >= 24.9 && bmi < 29.9) {
                System.out.println("You are overweight.");
            } else {
                System.out.println("You are obese.");
            }
        }
    }


