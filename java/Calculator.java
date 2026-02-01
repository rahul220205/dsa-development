import java.util.*;
public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the value of num 2 : ");
        int num2 = sc.nextInt();
        System.out.print("Enter operator (+,-,*,/) : ");
        char operator = sc.next().charAt(0);
        switch(operator){
            case '+' : System.out.println(num1+num2);
                        break;
                        
            case '-' : System.out.println(num1-num2);
                        break;

            case '*' : System.out.println(num1*num2);
                        break;

            case '/' : if(num2 == 0){
                        System.out.println("num1 can't divided by Zero");
                        break;
                        }
                        System.out.println(num1/num2);
                        break;


            default :  System.out.println("Wrong Operator. ");

        }
    }
}
