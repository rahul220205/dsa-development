/*
    s s s * s s s   3space 1star 3space
    s s * * * s s   2space 3star 2space
    s * * * * * s   1space 5star 1space
    * * * * * * *   0space 7star 0space

    * * * * * * *   0space 7star 0space
    s * * * * * s   1space 5star 1space
    s s * * * s s   2space 3star 2space
    s s s * s s s   3space 1star 3space


*/
public class Diamond {

    public static void main(String[] args) {
        int n = 4;
        // upper phase
        for(int row = 0;row<n;row++){
            // spaces 
            for(int col = 0;col<n-row-1;col++){
                System.out.print(" ");
            }
            // stars
            for(int col = 0;col<2*row+1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        // lower phase
        for(int row = 0;row<n;row++){
            // spaces 
            for(int col = 0;col<row;col++){
                System.out.print(" ");
            }
            // stars
            for(int col = 0;col<2*n-2*row-1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
