package lab5;

public class G extends F {
     protected String g;

    public G(String g) {

        this.g = g;
    }
    public G(){}

    @Override
    public String toString() {
        return "x="+x+" , "+
                "g='" + g + '\'' +
                ", f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' ;
    }
}
