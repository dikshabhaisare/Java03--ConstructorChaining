package OOPS.ConstructorChaining;

class City {
    City(int a) {
        System.out.println("Paris");
    }

    City(double d) {
        this("PQR");
        System.out.println("London");
    }

    City(String s) {
        this(10);
        System.out.println("New York");
    }


    public static void main(String[] args) {
        City ref = new City(4.5);
    }
}
