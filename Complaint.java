// This class stores the details of one complaint

public class Complaint 
{

    private int id;
    private String title;
    private String location;
    private int urgency;
    private int peopleAffected;
    private int safetyImpact;
    private int priorityScore;
    private String status;

    // Constructor to create a complaint
    public Complaint(int id, String title, String location,
                     int urgency, int peopleAffected, int safetyImpact) 
                     {

        this.id = id;
        this.title = title;
        this.location = location;
        this.urgency = urgency;
        this.peopleAffected = peopleAffected;
        this.safetyImpact = safetyImpact;

        // Calculate priority using the three given factors
        priorityScore = urgency + peopleAffected + safetyImpact;

        // Every new complaint starts as Pending
        status = "Pending";
    }

    // Returns the complaint ID
    public int getId() 
    {
        return id;
    }

    // Returns the prriority score
    public int getPriorityScore() {
        return priorityScore;
    }

    // Returns the current status
    public String getStatus() 
    {
        return status;
    }

    // Changes the complaint status
    public void updateStatus(String newStatus)
     {
        status = newStatus;
    }

    // Displays complaaint details on the screen
    public void display()
     {

        System.out.println("----------------------------------");
        System.out.println("Complaint ID : " + id);
        System.out.println("Problem      : " + title);
        System.out.println("Location     : " + location);
        System.out.println("Priority     : " + priorityScore);
        System.out.println("Status       : " + status);
        System.out.println("----------------------------------");
    }

    // Returns complaint details in string format for the report
    public String getReport() 
    {

        return "ID: " + id +
                " | Problem: " + title +
                " | Location: " + location +
                " | Priority: " + priorityScore +
                " | Status: " + status;
    }
}