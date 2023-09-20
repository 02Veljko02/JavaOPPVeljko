public class Calculator {
    private int a;
    private int b;
    public Calculator(int a, int b){
        setA(a);
        setB(b);
    }
    public int sabiranje(){
        return a + b;
    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }


}
