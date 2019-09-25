public class AddMatrices {
    public static void main(String[] args) {
addMat();
    }
    public static void addMat(){
        int [][]a ={ {1,2,3},{3,6,8},{9,12,45}};
        int [][]b ={{30,20,10},{10,30,40},{20,40,50}};
        int [][]c = new int[2][3];
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <3 ; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j]+" ");

            }
            System.out.println();
            
        }
    }
}
