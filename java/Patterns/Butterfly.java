// *      * 1star 6space 1star
// **    ** 2star 4space 2star
// ***  *** 3star 2space 3star      
// ******** 4star 0space 4star

// ******** 4star 0space 4star
// ***  *** 3star 2space 3star 
// **    ** 2star 4space 2star     
// *      * 1star 6space 1star
public class Butterfly {
    public static void main(String[] args) {
       int n = 4;
    //   upper Pattern
       for(int row = 0 ;row<n; row++){
        // stars
        for(int col = 0;col<row+1;col++){
            System.out.print("*");
        }
        // space
        for(int col = 0;col<n+2-(2*row);col++){
            System.out.print(" ");
        }
        // stars
        for(int col = 0;col<row+1;col++){
            System.out.print("*");
        }

        System.out.println();
       } 

    //    lower Pattern
       for(int row = 0 ;row<n; row++){
        // stars
        for(int col = 0;col<n-row;col++){
            System.out.print("*");
        }
        // space
        for(int col = 0;col<2*row;col++){
            System.out.print(" ");
        }
        // stars
        for(int col = 0;col<n-row;col++){
            System.out.print("*");
        }

        System.out.println();
       } 
    }    
}
