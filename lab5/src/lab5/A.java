package lab5;

public class A {
    protected String a;
    protected X x=new X("X");

     public A (){}

    public A(String a) {
        this.a = a;

    }



    @Override
    public String toString() {
        return "x="+x+" , "+
                "a=" + a ;
    }
}
