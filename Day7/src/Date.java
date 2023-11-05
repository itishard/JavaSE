//this的引用
public class Date {
    public int year;
    public int month;
    public int day;
    public void setDate(int year,int month,int day){
        //不加this 则局部变量优先 数值都为0
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void print(){
        System.out.println(year+"."+month+"."+day);
    }

    //就地初始化
    public Date(){
        this.year= 2008;
        this.month = 8;
        this.day = 9;
    }

    public Date(int year,int month,int day){
        this.year =year;
        this.month =month;
        this.day = day;
        System.out.println("构成重写");
    }

    public Date(int year) {
        this.year = year;
    }

    public static void main(String[] args) {
        Date date = new Date();
        date.setDate(1900,8,13);
        date.print();

        Date date1 = new Date();
        date1.setDate(1900,8,13);
        date1.print();

        //在类中方法外成为成员变量 初始化默认值为0
        //在方法中的变量为局部变量，需要进行初始化
        Date date2 = new Date();
        System.out.println(date2.day);

        //在对象初始化过程中 自动生成public Date() 在设定了新的构造方法后空Public Date不再提供
        Date date3 = new Date();
        date3.print();

    }
}
