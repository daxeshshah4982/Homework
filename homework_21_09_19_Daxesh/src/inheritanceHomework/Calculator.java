package inheritanceHomework;

public class Calculator {
int a;
int b;

    public Calculator(int a , int b){
       this.a =a;
       this.b = b;
    }

    public int addition(int a, int b, int c){
        System.out.println("addition of a and b is : "+( this.a +this.b));
        return a + b +c;
    }
    public int addition(int a, int b){
        System.out.println(this.a +this.b);
        return this.a +this.b;
    }
    public int subtraction(int a, int b, int c){
        Calculator sub = new Calculator(2,5);
        int sub1 = sub.b - sub.a;
        int sub2= a - b;
        System.out.println("subtraction of a - b is : "+sub1);
        System.out.println("subtraction of a - b is : "+sub2);
        return a- b -c;
    }
}