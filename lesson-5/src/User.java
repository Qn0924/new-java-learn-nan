public class User {
    private int id;
    private String name;
    private int age;

    public void setId(int id) {
        if(id<=0){
            System.out.println("参数错误，已赋默认值");
            this.id=-1;
        }else {
            this.id = id;
        }
    }

    public void show(){
        System.out.println("id:" + this.id);
        System.out.println("name:" + this.name);
        System.out.println("age:" + this.age);
    }
}
