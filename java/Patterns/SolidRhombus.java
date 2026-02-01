/*
ssss*****ssss 4space 5star 4space 
sss*****sss   3space 5star 3star
ss*****ss     2space 5star 2space
s*****s       1space 5star 1space
*****         0space 5star 0space
*/
public class SolidRhombus {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 0 ; row<n;row++){
            // column for space
            for(int col = 0;col<n-row-1;col++){
                System.out.print(" ");
            }
            // column for stars
            for(int col = 0;col<n;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
