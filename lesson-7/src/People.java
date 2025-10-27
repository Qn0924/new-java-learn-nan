import java.util.Objects;

public class People {
    private String name;
    private int id;

    public People() {}
    public People(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        People people = new People();
        people.setName("张三");
        people.setId(1);
        System.out.println(people.toString());
        People people1 = new People();
        people1.setName("张三");
        people1.setId(1);
        System.out.println(people.equals(people1));
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        People people = (People) object;
        return id == people.id && Objects.equals(name, people.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
