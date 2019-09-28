/*Write a Java program to sum values of an array.

 */
public class SumInArrays {
    public static void main(String[] args) {
        sum();
    }

    public static void sum() {
        int[] a = {10, 56, 48, 1456, 89, 65, 478, 2565, 46};
        int[] b = {456, 45, 132, 4586, 23, 476, 16, 236};
        int[] c = {789, 885, 2322, 48, 12, 879, 236, 657, 33, 78};

        System.out.println("length of arrays a = " + a.length);
        System.out.println("length of arrays b = " + b.length);
        System.out.println("length of arrays c = " + c.length);
        int sum1 = a[1] + b[2] + a[4] + b[5] + b[0] + c[8];
        int sum2 = a[6] + a[3] + a[6] + b[4] + b[2] + c[0];
        int sum3 = a[6] + c[9] + a[0] + b[5] + b[3] + c[1];
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
        System.out.println("sum3 = " + sum3);

        int s1 = 0;
        for (int i = 0; i < a.length - 1; i++) {
            s1 = s1 + a[i];

        }
        System.out.println("Sum of an arrays a = " +s1);
        int s2 = 0;
        for (int i = 0; i < b.length - 1; i++) {
            s2 = s2 + b[i];

        }
        System.out.println("Sum of an arrays b = " +s2);
        int s3 = 0;
        for (int i = 0; i < c.length - 1; i++) {
            s3 = s3 + a[i];

        }
        System.out.println("Sum of an arrays c = " +s3);
    }
}
