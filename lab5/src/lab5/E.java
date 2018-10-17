package lab5;

public class E extends D {
    protected String e;

    public E( String e) {

        this.e = e;
    }
    public E(){}

    @Override
    public String toString() {
        return
                "e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' ;
    }
}
