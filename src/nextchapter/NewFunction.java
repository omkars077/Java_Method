package nextchapter;

public class NewFunction {

    public void message(String brand , double price){
        System.out.println("This is the latest version : "+brand);
        System.out.println("The price of this brand is : "+price+" rs ");
    }
    public void student(String name, int age){
        System.out.println("His real name is : "+name+" : "+"And his age is : "+age);
    }
    public static void main(String[] args){
        NewFunction obj= new NewFunction();
        obj.message("Samsung",12000.5);
        obj.student("Rohit Sharma",32);
    }


}
