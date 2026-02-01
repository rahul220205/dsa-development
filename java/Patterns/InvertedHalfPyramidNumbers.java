
public class InvertedHalfPyramidNumbers {
    public static void main(String[] args) {
        int n = 5;
        // row 
        for(int row = 0;row<n;row++){
            // column 
            for(int col = 0 ; col < n - row  ; col ++){
                System.out.print(col+1);
            }


            System.out.println();
        }
    }    
}
