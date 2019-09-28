package inheritanceHomework;

public class Average extends Multiplication {
    public Average(int a, int b){
        super(a,b);
    }
    public static double avg(double a,double b){
        return (a+b)/2;
    }

    @Override
    public int subtraction(int a, int b, int c) {
        return super.subtraction(a,b,c);
    }

    @Override
    public int multi(int a, int b,int c){

        return (a *b)*(a*c);
    }
    public static double div(double a, double b){
        return ((a/b)/b)/b;
    }

    @Override
    public int addition(int a, int b) {
        return (super.a+super.b)+(a+b);
    }

    @Override
    public String strAdd(String a, int b) {
        return super.a+b+a;
    }



}
