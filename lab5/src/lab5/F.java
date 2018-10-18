package lab5;

public class F extends E {
    protected String f;

    public F(String f) {
       this.f = f;
    }
    public F(){}

    @Override
    public String toString() {
        return "x="+x+" , "+
                "f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'';
    }
}
