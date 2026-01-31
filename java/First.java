import java.util.Scanner;
public class First{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a, b and c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a+b+c;
        System.out.println("Sum is: "+sum);
    }
}