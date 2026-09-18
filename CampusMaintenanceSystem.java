import java.util.Scanner;

// Main class of the project
public class CampusMaintenanceSystem 
{

    public static void main(String[] args) {

        // Scanner is used to taake input from the user
        Scanner sc = new Scanner(System.in);


        // Menu keeps running until the user chooses Exit
        while (true) 
            {

            System.out.println("\n==============================");
            System.out.println("   CAMPUS MAINTENANCE SYSTEM");
            System.out.println("==============================");

            System.out.println("1. Register Complaint");
            System.out.println("2. View Priority List");
            System.out.println("3. Update Complaint Status");
            System.out.println("4. Generate Report");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");


            try {

                // Take menu choice from the user
                int choice = sc.nextInt();


                // Perform operation according to the choice
                switch (choice) {

                    case 1:

                        // Register a new complaint
                        ComplaintManager.addComplaint(sc);
                        break;


                    case 2:

                        // Display complaints according to priority
                        ComplaintManager.displayPriorityList();
                        break;


                    case 3:

                        // Update complaint status
                        ComplaintManager.updateStatus(sc);
                        break;


                    case 4:

                        // Generate report file
                        ReportGenerator.generateReport();
                        break;


                    case 5:

                        // End the program
                        System.out.println("Thank you!");
                        sc.close();
                        return;


                    default:

                        // Handles an invalid menu choice
                        System.out.println(
                                "Please enter a valid choice."
                        );
                }


            } catch (Exception e) 
            {

                // Handles non-numeric meanu input
                System.out.println("Invalid input.");

                if (sc.hasNextLine()) {
                    sc.nextLine();
                }
            }
        }
    }
}