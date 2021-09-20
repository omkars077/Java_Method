package nextchapter;

public class Calculator {

    public int  addition(int a , int b){
        int output=a+b;
        return output;
    }
    public static void main(String[] args){
        Calculator obj= new Calculator();
       int var= obj.addition(786,897);
        System.out.println("The addition of two value will be : "+var);
    }



}
