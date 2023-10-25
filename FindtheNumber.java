import java.util.Random;

public class FindtheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        while (count < 10) {
            int randomNumber = random.nextInt(100) + 1; // Generates a random number between 1 and 100

            if (randomNumber > largest) {
                largest = randomNumber;
            }

            if (randomNumber < smallest) {
                smallest = randomNumber;
            }

            count++;
        }

        System.out.println("Largest number in the set: " + largest);
        System.out.println("Smallest number in the set: " + smallest);
    }
}

