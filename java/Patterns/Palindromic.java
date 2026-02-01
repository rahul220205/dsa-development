/*
s s s s 1  4space 1number(starts with row + 1 and decreasing) s s s s s  0number 5space
s s s 2 1  3space 2number(starts with row + 1 and decreasing) 2 s s s s  1number 4space 
s s 3 2 1  2space 3number(starts with row + 1 and decreasing) 2 3 s s s  2number 3space
s 4 3 2 1  1space 4number(starts with row + 1 and decreasing) 2 3 4 s s  3number 2space
5 4 3 2 1  0space 5number(starts with row + 1 and decreasing) 2 3 4 5 s  4number 1space
*/
public class Palindromic {
    public static void main(String[] args) {
        int n = 8;
        for(int row=0;row<n;row++){
            // for spaces
            for(int col=0;col<n-row-1;col++){
                System.out.print(" ");
            }
            int number = row+1;

            // for numbers (left part)
            for(int col=0;col<row+1;col++){
                System.out.print(number--);
            }
            int numberRight = 2;
            // for numbers (right part)
            for(int col=0;col<row;col++){
                System.out.print(numberRight++);
            }
            System.out.println();
        }
    }    
}
