public class Task {
    private static int count;

    private String name;
    private Status status;
    private Integer id;
    private String description;

    public Task(String name, Status status, String description) {
        this.name = name;
        this.status = status;
        this.description = description;
        count++;
        this.id = count;
    }

    public Task(String name, Status status) {
        this.name = name;
        this.status = status;
        count++;
        this.id = count;
    }

    public Task(String name) {
        this.name = name;
        count++;
        this.id = count;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setName(String name) {
        this.name = name;
    }


}
