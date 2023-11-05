
class Student {

    //普通成员方法
    public String name = "张三";
    public int age = 20;
    //构造方法
    public Student() {
        this.name = "李四";
        this.age = 19;
        System.out.println(this.name+" "+this.age);
    }
    public Student(String name,int age) {
        this.name = name;
        this.age = age;
        System.out.println(this.name+" "+this.age);
    }
    
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student("孙悟空",500);

    }
}


