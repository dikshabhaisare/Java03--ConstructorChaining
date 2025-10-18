package OOPS.ConstructorChaining;

class Demo1 {
    Demo1() {
        System.out.println("Demo() Constructor");
    }
}
class Sample extends Demo1 {
        Sample(){
            super();
            System.out.println("Sample() Constructor");
        }
}
public class DemoSample{
    public static void main(String[] args) {
        Sample ref = new Sample();
    }
}



