public class Main {
    public static void main1(String[] args) {
        Dog dog = new Dog();
        dog.name = "TK";
        dog.age = 10;
        dog.color = "黑色";
        //同一个类可以创建多个实例
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
    }


    //交换两个数
    public static void swap(Val val,Val val1){
        int tmp = val.val;
        val.val = val1.val;
        val1.val = tmp;

    }
    public static void main2 (String[] args) {
        Val val = new Val();
        Val val1 = new Val();
        val.val = 10;
        val1.val = 20;
        swap(val, val1);
        System.out.println(val.val);
        System.out.println(val1.val);
    }





}