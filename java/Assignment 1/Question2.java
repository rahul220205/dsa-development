// if fever is above 100 print you have fever otherwise not
import java.util.*;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();
        if(temperature>100){
            System.out.println("You have a fever");
        }
        else{
            System.out.print("You don't have a fever");
        }
    }
}
