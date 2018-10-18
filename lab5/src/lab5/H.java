package lab5;

public class H extends G {
     protected String h;
   protected X x=new X("X2");

    public H(String g, String h) {
        super(g);
        this.h = h;

    }

        public H(String h) {

        this.h = h;
    }
    public H(){}

    @Override
    public String toString() {
        return"x="+x+" , "+
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
