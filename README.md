# Campus Maintenance System

Campus Maintenance System is a Java console application for registering campus maintenance complaints, prioritizing them, updating their status, and generating a text report.

## Requirements

- Java Development Kit (JDK) 8 or later
- A terminal or command prompt
- No external libraries or package manager are required

## Setup

1. Install a JDK from a trusted Java distribution such as [Eclipse Temurin](https://adoptium.net/temurin/) or Oracle Java.
2. Verify that Java is installed and available on your `PATH`:

   ```text
   java -version
   javac -version
   ```

3. Open a terminal in the project root, the directory containing `CampusMaintenanceSystem.java`.

   On Windows, for example:

   ```powershell
   cd path\to\CampusMaintenanceSystem
   ```

There are no application configuration files, environment variables, databases, or third-party dependencies to install.

## Compile

Compile all source files from the project root:

```powershell
javac CampusMaintenanceSystem.java Complaint.java ComplaintManager.java ReportGenerator.java
```

This creates `.class` files in the same directory.

## Run

Start the application with:

```powershell
java CampusMaintenanceSystem
```

Use the numbered menu:

1. **Register Complaint**: enter an ID, problem, location, and ratings from 1 to 5 for urgency, people affected, and safety impact.
2. **View Priority List**: display complaints from highest to lowest priority score.
3. **Update Complaint Status**: select a complaint ID and set it to `In Progress` or `Resolved`.
4. **Generate Report**: write the current complaints to `maintenance_report.txt`.
5. **Exit**: close the application.

The priority score is calculated as:

```text
urgency + people affected + safety impact
```

Complaints are stored in memory while the program is running. They are not loaded from a database or restored automatically after the program exits.

## Report Output

Choosing **Generate Report** creates or overwrites `maintenance_report.txt` in the directory from which the application was started. Run the application from the project root if the report should be saved beside the source files.

## Troubleshooting

- If `java` or `javac` is not recognized, install a JDK and add its `bin` directory to the system `PATH`, then open a new terminal.
- If compilation reports an error in `ComplaintManager.java` near the `updateStatus` method, ensure the opening brace is written as `{` and not `\ {`.
- If the report cannot be found, check the terminal's current directory; the report is created relative to that directory.

## Project Files

| File | Purpose |
| --- | --- |
| `CampusMaintenanceSystem.java` | Application entry point and interactive menu |
| `Complaint.java` | Complaint data model and priority calculation |
| `ComplaintManager.java` | Complaint registration, sorting, and status updates |
| `ReportGenerator.java` | Text report generation |
| `maintenance_report.txt` | Generated report output example |