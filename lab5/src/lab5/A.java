package lab5;

public class A {
    protected String a;
    protected X x;

    public A(String a) {
        this.a = a;
        this.x =x;
    }
    public A(String a, String x){}

    @Override
    public String toString() {
        return "a=" + a ;
    }
}
