package nextchapter;

public class Calculator {

    public void addition(){
        int a=234;
        int b=987;
        int output=a+b;
        System.out.println("The addition of two value will be : "+output);
    }
    public void multi(){
        int a=89;
        int b=45;
        int result=a*b;
        System.out.println("The multiply of two value will be : "+result);
    }
    public void divide(){
        int a=625;
        int b=5;
        int value=a/b;
        System.out.println("This is divide method : "+value);
    }
    public static void main(String[] args){
        Calculator obj= new Calculator();
        obj.addition();
        obj.multi();
        obj.divide();
    }
}
