
public class StarPattern {
    public static void main(String[] args) {
        int  n = 5;
        // row 
        for(int i = 0;i<n;i++){
            // column
            for(int j = 0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
