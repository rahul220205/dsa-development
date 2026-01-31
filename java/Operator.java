import java.util.*;
import java.util.Scanner;
public class Operator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b : ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float sum = a+b;
        float substract = a-b;
        float mutliply =  a*b;
        float divide = a / b;
        
        System.out.println("Sum is: "+sum+"\nSubstraction is: "+substract+"\nMultiplication is: "+mutliply+"\nDivision is: "+divide);
    }
}
