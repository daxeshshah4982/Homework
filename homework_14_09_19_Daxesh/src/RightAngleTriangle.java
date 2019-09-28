public class RightAngleTriangle {
    public static void main(String[] args) {
        rat(4);
    }public static void rat(int number){
        for (int i = 1; i <=number ; i++) {
            for (int j =1; j <=i ; j++) {
                System.out.print("@");

            }
            System.out.println();

        }
    }
}
