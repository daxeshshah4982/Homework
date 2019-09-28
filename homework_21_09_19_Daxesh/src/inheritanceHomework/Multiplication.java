package inheritanceHomework;

public class Multiplication extends Calculator {
    public Multiplication(int a, int b) {
        super(a, b);
    }

    public int multi(int a, int b, int c) {

        return a * b;
    }

  public  static double div(double a, double b, double c) {
        return (a / b)/c;
    }

    public String strAdd(String a, int b) {
        System.out.println(a + b);
        return a+b;
    }
    public int subtraction(int a,int b){
        return ((a-b)-b)-a;

    }
}
