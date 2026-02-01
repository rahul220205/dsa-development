public class InvertedRotateHalfPyramid {
    public static void main(String[] args) {
        int n = 4;
        // row 
        for(int row = 0;row<n;row++){
            // column space wise
            for(int col = 0 ; col < n - row - 1 ; col ++){
                System.out.print(" ");
            }

            // column star wise
            for(int col = 0 ; col < row + 1 ; col ++){
                System.out.print("*");
            }

            System.out.println();
        }
    }    
}
