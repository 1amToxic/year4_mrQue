package prototype;

public class EmployeeRecord implements Prototype{
    private int id;
    private String name;

    public EmployeeRecord(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EmployeeRecord{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public Prototype getClone() {
        return new EmployeeRecord(id,name);
    }
}
