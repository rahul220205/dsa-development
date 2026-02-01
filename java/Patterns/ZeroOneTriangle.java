public class ZeroOneTriangle {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 0 ; row < n ; row++){
            for(int col = 0; col < row+1 ; col++){
                // even row 
                if(row % 2 == 0){
                    if(col % 2 == 0){
                        System.out.print("1 ");
                    }
                    else{
                        System.out.print("0 ");
                    }
                }
                else{
                    if(col % 2 == 0){
                        System.out.print("0 ");
                    }
                    else{
                        System.out.print("1 ");
                    }
                }
                
            }
            System.out.println();
        }
    }   
}
