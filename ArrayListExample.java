import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            ArrayList<Task> todoList = new ArrayList<>();
            while (true) {
                System.out.print("Press 1 to add a task.\nPress 2 to view all tasks.\nPress 3 to change the status of the task.\nPress 4 to delete a task.\nPress any other key to exit.\nEnter your choice: ");
                int userChoice = Integer.parseInt(sc.nextLine());

                if (userChoice == 1) {
                    System.out.print("Enter the task: ");
                    String taskName = sc.nextLine();

                    System.out.print("-Priorities-\n1-Low\n2-Medium\n3-High\nEnter the prority of task: " + taskName + ": ");
                    int priority = Integer.parseInt(sc.nextLine());

                    priority = priority > 3 ? 1 : priority;


                    todoList.add(new Task(taskName, priority));
                    System.out.println("Your task has been added successfully!");
                    System.out.println("-----------------------------------\n");
                }
                else if (userChoice == 2) {
                    if(!todoList.isEmpty()){
                        System.out.println("\n------------------------");
                        System.out.println("-Your Tasks-");
                        for(int i =0; i< todoList.size(); i++){
                            System.out.println(i+1+".) "+todoList.get(i));
                        }
//                    todoList.forEach(task -> System.out.println(task));
                        System.out.println("------------------------\n");
                }else{
                        System.out.println("\n\n===============");
                        System.out.println("No List Found!");
                        System.out.println("===============\n\n");
                    }
                }
                else if (userChoice == 3) {
                    System.out.println("Enter the name of the task: ");
                    String taskChange = sc.nextLine();
                    boolean found = false;
                    for(Task s : todoList){
                        if(s.getTaskName().equalsIgnoreCase(taskChange))
                        {
                            found = true;
                            System.out.print("-Status-\nEnter P for In-Progress.\nEnter C for Completed\nEnter the status of your task: ");
                            String updatedStatus = sc.nextLine();
                            if(updatedStatus.equalsIgnoreCase("P"))
                            {
                                s.setStatus(Task.IN_PROGRESS);
                            }
                            else if (updatedStatus.equalsIgnoreCase("C"))
                            {
                                s.setStatus(Task.COMPLETED);
                            }
                            System.out.println("Status has been changed successfully!");
                            break;
                        }

                    }
                }
                else if (userChoice == 4) {
                    System.out.print("Enter the task name: ");
                    String taskDelete = sc.nextLine();
                    boolean found = false;
                    for(Task s: todoList){
                        if(s.getTaskName().equalsIgnoreCase(taskDelete)){
                            found = true;
                            todoList.remove(s);
                            System.out.println("Task Deleted Successfully!");
                            System.out.println("===============================");

                        }
                        if (!found){
                            System.out.println("Task not found!");
                            System.out.println("=========================");
                        }
                    }
                }
                else{
                    System.out.println("Closing the system!");
                    break;
                }


            }
        }catch (NumberFormatException e){
            System.out.println("Invalid input! "+e.getMessage());
        }
        {

        }
    }
}
