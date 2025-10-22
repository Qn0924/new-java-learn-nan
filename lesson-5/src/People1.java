public class People1 {
    private int age;
    private String name;
    private String gender;

    public People1() {
        System.out.println("People1 constructor");
    }

    public People1(int age) {
        System.out.println("People1 constructor ter");
        this.age = age;
    }

    public People1(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
