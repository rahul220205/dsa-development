// wap to input the year and find whwether the year is leap year or not
import java.util.*;
public class Question5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        if(year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)){
            System.out.println(year+ " is the leap year.");
        }
        else{
            System.out.println(year+ " is not the leap year.");
            
        }
    }
}
