import java.util.Scanner;

public class hotel_booking {

	public static void main(String[] args)
	{
		char ans;
		Scanner sc = new Scanner(System.in);
        do {
        // Room types and corresponding costs per day
        String[] roomTypes = {"Luxury", "A/C", "Non A/C", "Deluxe"};
        int[] roomCosts = {2500, 2000, 1500, 2000}; 
        
        // Display available room types and costs
        System.out.println("Taj Hotel Room Types and Costs Per Day:");
        for (int i = 0; i < roomTypes.length; i++) 
        {
            System.out.println((i + 1) + ". " + roomTypes[i] + ": " + roomCosts[i]);
        }
        
        // Get user input for room type selection
        System.out.print("\nEnter the number corresponding to the room type you want to reserve: ");
        int selectedRoomIndex = sc.nextInt() - 1;
        
        // Validate user input
        if (selectedRoomIndex < 0 || selectedRoomIndex >= roomTypes.length) {
            System.out.println("Invalid room type selection. Please try again.");
            return;
        }
        
        // Get user input for number of days to stay
        System.out.print("Enter the number of days you want to stay: ");
        int numberOfDays = sc.nextInt();
        
        // Calculate total cost
        int totalCost = roomCosts[selectedRoomIndex] * numberOfDays;
        
        // Display reservation details
        System.out.println("\nReservation Details:");
        System.out.println("Room Type: " + roomTypes[selectedRoomIndex]);
        System.out.println("Cost Per Day: " + roomCosts[selectedRoomIndex]);
        System.out.println("Number of Days: " + numberOfDays);
        System.out.println("Total Cost: " + totalCost);
        System.out.println("Do you want to Book any other room Y/N");
		ans=sc.next().charAt(0);
        }while(ans=='Y'||ans=='y');
    }


	}


