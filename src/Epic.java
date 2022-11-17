import java.util.HashMap;
import java.util.Map;

public class Epic extends Task{

    private HashMap<Integer, Subtask> collectSubTask = new HashMap<Integer, Subtask>();

    public Epic(String name, Status status) {
        super(name, status);
    }

    public void addSubTask(Subtask subtask) {
        collectSubTask.put(subtask.getId(), subtask);
    }


    public HashMap<Integer , Subtask> getAllSubTask() {
        return collectSubTask;
    }

    public Subtask getSubtask(Integer id) {
        return collectSubTask.get(id);
    }

    public void removeSubTask(Integer id) {
        collectSubTask.remove(id);
    }

    public void checkStatus() {
        int mapLenth = collectSubTask.size();
        int doneTask = 0;
        for (Map.Entry<Integer, Subtask> entry : collectSubTask.entrySet()) {
            if (entry.getValue().getStatus() == Status.DONE) {
                doneTask++;
            }
        }
        if (doneTask == mapLenth) {
            super.setStatus(Status.DONE);
        } else {
            super.setStatus(Status.IN_PROGRESS);
        }
    }



}
