package OOPS.ConstructorChaining;

class Alpha{
    int p;
    int q;
    Alpha(){
        p = 10;
        q = 20;
    }
}
class Beta extends Alpha{
    int r;
    int s;
    Beta(){
        r = 30;
        s = 40;
    }
}
public class AlphaBeta {
    public static void main(String[] args) {
        Beta obj = new Beta();
        System.out.println(obj.p);
        System.out.println(obj.q);
        System.out.println(obj.r);
        System.out.println(obj.s);


    }
}
