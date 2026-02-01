// conditionals statement questions
import java.util.*;
public class Question1{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number :");
    int num = sc.nextInt();
    if(num > 0){
        System.out.println(num+" is Positive.");
        return;
    }
    else if(num == 0){
        System.out.println(num+" is Zero.");
        return; 
    }
    System.out.println(num+" is negative.");
  }  
}
