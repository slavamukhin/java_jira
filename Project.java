import java.util.ArrayList;

public class Project {
  String name;
  ArrayList<Task> tasks = new ArrayList<Task>();
  // teamMembers

  Project(String name) {
    this.name = name;
  }

  String getNameProject() {
    return this.name;
  }

  Void createTask(String title, String description) {
    this.tasks.add(new Task(title, description));
    return null;
  }

  ArrayList<Task> getAllTasks() {
    return this.tasks;
  }
}
