/* 
    ssss1ssss 4space row+1number(1) 4space
    sss22sss  3space row+1number(2) 3space
    ss333ss   2space row+1number(3) 2space
    s4444s    1space row+1nummber(4) 1space
    55555     0space row+1number(5) 0space
*/
public class NumberPyramid {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 0;row<n;row++){
            // spaces
            for(int col = 0;col<n-row-1;col++){
                System.out.print(" ");
            }

            // numbers
            for(int col = 0;col<row+1;col++){
                System.out.print(row+1+" ");
            }
            System.out.println();
        }
    }    
}
