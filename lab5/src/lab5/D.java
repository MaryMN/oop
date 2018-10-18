package lab5;

public class D extends C {
    protected String d;
    protected X x=new X("X1");

    public D(String c, String d, X x) {
        super(c);
        this.d = d;
        this.x = x;
    }

    public D(String d, X x) {
        this.d = d;
        this.x = x;
    }

    public D(String d) {
        this.d = d;
    }
    public D (){}

    @Override
    public String toString() {
        return "x="+x+" , "+
                "d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' ;
    }
}
