/*
ssss*****ssss 4space 5star 4space 
sss*sss*sss   3space 2star(3space) 3star
ss*sss*ss     2space 2star(3space) 2space
s*sss*s       1space 2star(3space) 1space
*****         0space 2star(3space) 0space
*/

public class HollowRhombus {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 0 ; row<n;row++){
            // column for space
            for(int col = 0;col<n-row-1;col++){
                System.out.print(" ");
            }
            // column for stars
            for(int col = 0;col<n;col++){
                if(row == 0 || row == n-1 || col == 0 || col == n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }    
}

