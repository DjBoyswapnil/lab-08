import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) 
    {
    	int average, size;
        Scanner sc = new Scanner(System.in);

        // Accept the size of the array from the user
        System.out.print("Enter the size of the array: ");
         size = sc.nextInt();

        // Create an array to store the numbers
        int[] numbers1 = new int[size];

        // Prompt the user to input numbers
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers1[i] = sc.nextInt();
        }

        // Calculate the sum of the numbers
        int sum = 0;
        for (  int number1 : numbers1)
        {
            sum += number1;
        }

        // Calculate the average
         average =  sum / size;

        // Print the average
        System.out.println("Average of the numbers: " + average);
    }
}
