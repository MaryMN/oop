package lab5;

public class I extends H {
    protected String i;

    public I(String i) {

        this.i = i;
    }
    public I(){}

    @Override
    public String toString() {
        return
                "i='" + i + '\'' +
                ", h='" + h + '\'' +
                ", g='" + g + '\'' +
                ", f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' ;
    }
}
