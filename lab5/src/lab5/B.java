package lab5;

public class B extends A {
    protected String b;

    public B(String b) {

        this.b = b;
    }
    public B(){

    }

    @Override
    public String toString() {
        return "x="+x+" , "+
                "b="+b+" , " +
                "a=" + a;
    }
}
