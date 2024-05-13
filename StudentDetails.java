import java.util.Scanner;

public class StudentDetails 
	{
    //class to represent a student
    static class Student 
    {
        String name;
        int rollNumber;
        int age;

        public Student(String name, int rollNumber, int age) 
        {
            this.name = name;
            this.rollNumber = rollNumber;
            this.age = age;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Accept the number of students from the user
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        // Create an array to store the student objects
        Student[] students = new Student[numStudents];

        // Accept student details from the user
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            sc.nextLine(); // Consume the newline character
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Roll Number: ");
            int rollNumber = sc.nextInt();
            System.out.print("Age: ");
            int age = sc.nextInt();

            // Create a student object with the input details and store it in the array
            students[i] = new Student(name, rollNumber, age);
        }

        // Display the student details
        System.out.println("\nStudent Details:");
        for (int i = 0; i < numStudents; i++) 
        {
            System.out.println("\nDetails of student " + (i + 1) + ":");
            System.out.println("Name: " + students[i].name);
            System.out.println("Roll Number: " + students[i].rollNumber);
            System.out.println("Age: " + students[i].age);
        }
    }
}