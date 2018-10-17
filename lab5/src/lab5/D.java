package lab5;

public class D extends C {
    protected String d;

    public D(String d) {
        this.d = d;
    }
    public D (){}

    @Override
    public String toString() {
        return
                "d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' ;
    }
}
