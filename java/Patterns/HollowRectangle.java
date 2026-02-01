
public class HollowRectangle {
    public static void main(String[] args) {
        int n = 4;
        // rows
        for(int i = 0;i<n;i++){
            // columns
            for(int j = 0; j<n+1;j++){
                if(i == 0 || i == n-1 || j == 0 || j == n){
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
