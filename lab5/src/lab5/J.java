package lab5;

public class J extends I {
    protected String j;

    public J(String j) {

        this.j = j;
    }
    public J(){}

    @Override
    public String toString() {
        return  "j='" + j + '\'' +
                ", i='" + i + '\'' +
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
