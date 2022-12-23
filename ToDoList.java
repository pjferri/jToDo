import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
  ArrayList<String> list;
  
  public ToDoList() {
    list = new ArrayList<String>();
  }
  
  public void addTask(String task) {
    list.add(task);
  }
  
  public void removeTask(int index) {
    list.remove(index);
  }
  
  public void printTasks() {
    for (int i = 0; i < list.size(); i++) {
      System.out.println((i+1) + ". " + list.get(i));
    }
  }
  
  public static void main(String[] args) {
    ToDoList toDoList = new ToDoList();
    Scanner scanner = new Scanner(System.in);
    boolean running = true;
    
    while (running) {
      System.out.println("Enter a command (add, remove, print, quit): ");
      String command = scanner.nextLine();
      
      if (command.equals("add")) {
        System.out.println("Enter a task to add: ");
        String task = scanner.nextLine();
        toDoList.addTask(task);
      } else if (command.equals("remove")) {
        System.out.println("Enter the index of the task to remove: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        toDoList.removeTask(index);
      } else if (command.equals("print")) {
        toDoList.printTasks();
      } else if (command.equals("quit")) {
        running = false;
      } else {
        System.out.println("Invalid command");
      }
    }
    
    scanner.close();
  }
}
