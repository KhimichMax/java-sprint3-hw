import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Task task1 = new Task("�������1", Status.NEW, "��������");
        Task task2 = new Task("�������2", Status.IN_PROGRESS, "��������");
        Epic epic1 = new Epic("����1", Status.NEW);
        Epic epic2 = new Epic("����2", Status.NEW);
        Subtask subtask1 = new Subtask("���������1", epic1);
        Subtask subtask1_2 = new Subtask("���������2", epic1);
        Subtask subtask2 = new Subtask("���������3", epic2);

        manager.addMainTask(task1);
        manager.addMainTask(task2);
        epic1.addSubTask(subtask1);
        epic1.addSubTask(subtask1_2);
        epic2.addSubTask(subtask2);
        manager.addMainTask(epic1);
        manager.addMainTask(epic2);


        for (Map.Entry<Integer, Task> entry : manager.getAllTask().entrySet()) {
            System.out.println(entry.getValue().getName() + " " + entry.getValue().getStatus());
            if (entry.getValue() instanceof Epic) {
                HashMap<Integer, Subtask> collectEpic = ((Epic) entry.getValue()).getAllSubTask();
                for (Map.Entry<Integer, Subtask> entry1 : collectEpic.entrySet()) {
                    entry1.getValue().setStatus(Status.DONE);
                    System.out.println(entry1.getValue().getName());
                }
            }
            System.out.println(entry.getValue().getName() + " " + entry.getValue().getStatus());
        }
    }
}
