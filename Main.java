import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");

    Project project = new Project("Test");
    String nameProject = project.getNameProject();
    System.out.println(nameProject);

    project.createTask("Сделать какую-то хрень", "Да надо сделать хрень");
    ArrayList<Task> allTasks = project.getAllTasks();
    System.out.println("title: " + allTasks.get(0).title + " desc: " + allTasks.get(0).description);
  }
}