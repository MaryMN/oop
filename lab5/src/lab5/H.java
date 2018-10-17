package lab5;

public class H extends G {
     protected String h;

    public H(String h) {

        this.h = h;
    }
    public H(){}

    @Override
    public String toString() {
        return
                "h='" + h + '\'' +
                ", g='" + g + '\'' +
                ", f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' ;
    }
}
