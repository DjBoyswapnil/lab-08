import java.util.Scanner;

public  class Book 
	{
    private int bookId;
    private String title;
    private String authorName;
    private double price;
	

    public Book(int bookId, String title, String authorName, double price) 
    {
        this.bookId = bookId;
        this.title = title;
        this.authorName = authorName;
        this.price = price;
    }

    public void printBookDetails() 
    {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author Name: " + authorName);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args)
    {
        // Create an array of Book objects
        Book[] textbooks = new Book[3];

        // Assign values to Book objects
        textbooks[0] = new Book(101, "To Kill a Mockingbird", "Harper Lee", 85);
        textbooks[1] = new Book(102, "1984", "George Orwell", 58);
        textbooks[2] = new Book(103, "The Catcher in the Rye", "J.D. Salinger", 169);
        
        char ans;
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        do {
        // Get the book ID from the user
        System.out.print("Enter the book ID to check availability: ");
        int searchId = sc.nextInt();

        boolean bookFound = false;

        // Search for the book in the array
        for (Book book : textbooks) 
        {
            if (book.bookId == searchId) 
            {
                bookFound = true;
                System.out.println("Book is available. Details:");
                book.printBookDetails();
                break; // Exit the loop if the book is found
            }
        }

        // If book is not found, display a message
        if (!bookFound) 
        {
            System.out.println("Book with ID " + searchId + " is not available.");
        }
        System.out.println("Do you want  any other book Y/N");
		ans=sc.next().charAt(0);
        }while(ans=='Y'||ans=='y');
    }
}