package Task5_TaskManager_FileIO;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class TaskManagerFileIO {
      static ArrayList<String> tasks = new ArrayList<>();
    static final String FILE_NAME = "tasks.txt";
  
public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);
       loadTasks();

        int choice;

        do {

            System.out.println("\n======================================");
            System.out.println("        TASK MANAGER SYSTEM");
            System.out.println("======================================");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("\nEnter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Task: ");
                    String task = sc.nextLine();

                    tasks.add(task);
                    saveTasks();

                    System.out.println("Task Added Successfully!");
                    break;

                case 2:

                    if (tasks.isEmpty()) {
                        System.out.println("No Tasks Available.");
                    } else {

                        System.out.println("\n===== TASK LIST =====");

                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }

                    break;

                    case 3:

    if (tasks.isEmpty()) {
        System.out.println("No Tasks Available to Update.");
    } else {

        System.out.println("\n===== TASK LIST =====");

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }

        System.out.print("\nEnter Task Number to Update: ");
        int updateIndex = sc.nextInt();
        sc.nextLine();

        if (updateIndex >= 1 && updateIndex <= tasks.size()) {

            System.out.print("Enter New Task: ");
            String newTask = sc.nextLine();

            tasks.set(updateIndex - 1, newTask);
            saveTasks();

            System.out.println("Task Updated Successfully!");

        } else {
            System.out.println("Invalid Task Number!");
        }
    }

    break;

    case 4:

    if (tasks.isEmpty()) {
        System.out.println("No Tasks Available to Delete.");
    } else {

        System.out.println("\n===== TASK LIST =====");

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }

        System.out.print("\nEnter Task Number to Delete: ");
        int deleteIndex = sc.nextInt();

        if (deleteIndex >= 1 && deleteIndex <= tasks.size()) {

            tasks.remove(deleteIndex - 1);
            saveTasks();

            System.out.println("Task Deleted Successfully!");

        } else {
            System.out.println("Invalid Task Number!");
        }
    }

    break;

                case 5:
                   System.out.println("\n======================================");
System.out.println(" Thank You for Using Task Manager!");
System.out.println(" Have a Great Day!");
System.out.println("======================================");
break;

                default:
                   System.out.println("Invalid Choice! Please enter a number between 1 and 5.");
}
        } while (choice != 5);

        sc.close();
    }

    // Load tasks from file
public static void loadTasks() {

    try {

        File file = new File(FILE_NAME);

        if (!file.exists()) {
            file.createNewFile();
            return;
        }

        BufferedReader br = new BufferedReader(new FileReader(file));

        String line;

        while ((line = br.readLine()) != null) {
            tasks.add(line);
        }

        br.close();

    } catch (IOException e) {
        System.out.println("Error loading tasks.");
    }
}

// Save tasks to file
public static void saveTasks() {

    try {

        BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME));

        for (String task : tasks) {
            bw.write(task);
            bw.newLine();
        }

        bw.close();

    } catch (IOException e) {
        System.out.println("Error saving tasks.");
    }
}
}
