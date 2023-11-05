class Student {
    public String name;
    public int age;
    //静态成员变量
    public static String classRoom;

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        Student.classRoom = classRoom;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //静态成员方法
    public static void sleep(){
        System.out.println(classRoom + " 正在睡觉");
    }
    //private方法只能在student类中使用
    private void eat(){
        System.out.println(this.name +"正在吃饭");
    }

    void play(){
        System.out.println(this.name + "正在打保卫萝卜");
    }


}

public class Main {

    public static void main(String[] args) {
        Student student = new Student("cyp",21);
        Student.classRoom = "501";
        System.out.println(student.getName());
        Student.sleep();

        Student student1 = new Student("gxt",19);


    }
}