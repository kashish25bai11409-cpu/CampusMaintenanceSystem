import java.io.FileWriter;
import java.io.IOException;

// This class is used to generate the maintenance report
public class ReportGenerator 
{

    // Creates a text file containing all complaints
    static void generateReport()
    {

        try 
        {

            // Create/open the report file
            FileWriter writer =
                    new FileWriter("maintenance_report.txt");


            // Write the heading of the report
            writer.write("CAMPUS MAINTENANCE REPORT\n");
            writer.write("=========================\n\n");


            // Write details of every complaint
            for (Complaint c : ComplaintManager.complaints)
                 {

                writer.write(c.getReport() + "\n");
            }


            // Close the file
            writer.close();

            System.out.println(
                    "Report generated successfully!"
            );


        } catch (IOException e) 
        {

            // Handles errors related to file writing
            System.out.println(
                    "Error while creating report."
            );
        }
    }
}