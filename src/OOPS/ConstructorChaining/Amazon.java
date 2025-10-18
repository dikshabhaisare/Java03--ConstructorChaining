package OOPS.ConstructorChaining;

class Amazon {
    Amazon(){
        System.out.println("Initializa Shopping");
    }
    Amazon(double subscription){
        this();
        System.out.println("Initialize Video");
        System.out.println("Initialize Music");
    }


    public static void main(String[] args) {
        Amazon ref = new Amazon(1299.0);
    }
}