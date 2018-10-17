package lab5;

public class C extends B {
    protected String c;

    public C(String c) {
        this.c = c;
    }
    public C(){}

    @Override
    public String toString() {
        return
                "c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\''
                ;
    }
}
