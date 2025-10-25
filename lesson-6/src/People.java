public class People {
    private int id=3;

    public People() {
        System.out.println("编号是"+id);
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void show(){
        System.out.println("编号是"+id);
    }
}
