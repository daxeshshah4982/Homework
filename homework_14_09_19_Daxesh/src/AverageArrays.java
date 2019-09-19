public class AverageArrays {
    public static void main(String[] args) {
        average();
    }
    public static void average(){
        int []a = {10,65,789,456,45,789,16,78,4566,1535,47,23,965,752};
        int sum = 0;
        for (int i = 0; i <a.length ; i++) {
             sum = sum + a[i];
        }
        int avg = sum /a.length;
        System.out.println("Sum of the arrays a = "+sum);
        System.out.println("length of the arrays a = " +a.length);
        System.out.println("average of the arrays a = "+avg);


    }
}
