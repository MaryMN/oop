package lab5;

public class B extends A {
    protected String b;

    public B(String b) {

        super("a", "x");
        this.b = b;
    }
    public B(){
        super("a", "x");
    }

    @Override
    public String toString() {
        return "b="+b+" , "+
                "a=" + a;
    }
}
