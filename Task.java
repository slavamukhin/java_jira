enum ETaskStatus {
  NEW, WORKING, DONE
}

public class Task {
  String title;
  String description;
  ETaskStatus status;

  Task(String title, String description) {
    this.title = title;
    this.description = description;
    this.status = ETaskStatus.NEW;
  }

  Void chengeStatus(ETaskStatus status) {
    this.status = status;
    return null;
  }
}
