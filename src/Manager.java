import java.util.HashMap;

public class Manager {
    private HashMap<Integer, Task> collectMainTask = new HashMap<Integer, Task>();


    public HashMap<Integer, Task> getAllTask() {
        return collectMainTask;
    }

    public void addMainTask(Task task) {
        collectMainTask.put(task.getId(), task);
    }

    public Task getTask(Integer id) {
        return collectMainTask.get(id);
    }

    public HashMap<Integer, Subtask> getAllSome(Integer id) {
        Epic epic = (Epic)  collectMainTask.get(id);
        return epic.getAllSubTask();
    }

    public void removeTask(Integer id) {
        collectMainTask.remove(id);
    }


}
