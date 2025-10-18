package OOPS.ConstructorChaining;
class Parent{
    Parent(){
        System.out.println("aaaaaaaaa");
    }
    Parent(int a){
        System.out.println("bbbbbbbbb");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("cccccccccc");
    }
    Child(int y){
        System.out.println("ddddddddd");
    }
}

public class ParentChild {
    public static void main(String[] args) {

    }
}
