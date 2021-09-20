package nextchapter;

public class NewFunction {

    public void read(){
        System.out.println("This is read method .");
    }
    public void write(){
        System.out.println("This is a new function in java method .");
    }
    public void play(){
        System.out.println("This is play method of java method.");
    }
    public static void main(String[] args){
        NewFunction obj= new NewFunction();
        obj.read();
        obj.write();
        obj.play();
    }


}
