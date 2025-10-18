package ExceptionHandling.CustomException;
class MyCustomException extends Exception{
    MyCustomException(){

    }
    MyCustomException(String msg){
        super(msg);
    }
}
class Trigger{
    static void verify(int num) throws MyCustomException{
        if(num%2 == 0 && num%3 == 0){
            MyCustomException obj = new MyCustomException("Exception Occured");
            throw obj;
        }else{
            System.out.println("All is well");
        }
    }
}
public class Example1 {
    public static void main(String[] args) {
        try{
            Trigger.verify(10);
            Trigger.verify(15);
            Trigger.verify(12);
        }
        catch(MyCustomException e){
            System.out.println(e.getMessage());
        }
    }
}
