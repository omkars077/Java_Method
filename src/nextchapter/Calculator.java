package nextchapter;

public class Calculator {


    public void addition(int a , int b){
        int result=a+b;
        System.out.println("The addition of two value will be : "+result);
    }
    public void multi(int a, int b){
        int output=a*b;
        System.out.println("The multi of two value will be : "+output);
    }
    public static void main(String[] args){
        Calculator obj= new Calculator();
        obj.addition(6859,4593);
        obj.multi(345,89);

    }



}
