package exercise;

public class Test6 {
    public static void main(String[] args) {


        int[][] a = new int[3][3];
        a[0][0] = 10;



        int count = 0;
        for(int i=0; i<3; i++){
            for(int k=0; k<3; k++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
