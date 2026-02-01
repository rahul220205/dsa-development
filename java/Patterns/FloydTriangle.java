public class FloydTriangle {
 public static void main(String[] args) {
        int n = 5;
        int count = 1;
        // row 
        for(int row = 0;row<n;row++){
            // column 
            for(int col = 0 ; col < row + 1  ; col ++){
                System.out.print(count++);
            }


            System.out.println();
        }
    }    
}
