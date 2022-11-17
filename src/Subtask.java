public class Subtask extends Task{

    private Epic epic;

    public Subtask(String name, Epic epic) {
        super(name);
        this.epic = epic;
        super.setStatus(Status.NEW);
    }

    @Override
    public void setStatus(Status status) {
        super.setStatus(status);
        epic.checkStatus();
    }
}
