public class ReversedPyramid {
    public static void reversedPyramid(int n){
        int i, j, k;
        for (i = 0; i <= n - 1; i++){
            for (j = 0; j <= i; j++){
                System.out.print(" ");
            }
            for (k = 0; k <= n - 1 - i; k++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int n = 5;
        reversedPyramid(n);
    }
}