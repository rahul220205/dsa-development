// type casting -- (implicit type conversion -- ye conversion compiler dware hota hain  )
// it is the process of converting one data type to another data type
// conditions of type casting
// 1. short size data type hi big size me convert hoga . (jese float to double)
import java.util.*;
public class TypeCasting{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int oldNum = 10;
        double newNum = oldNum;  // automatice type conversion  (implicit)



        // explicit type conversion - agar hum kisi data type ko forcefully dusre type me convert krde do

        // by default java koi bhi decimal vala ko as a double leta hain . agar tum chahte ho ki java usko float treat kre to uske value ke baad 'f' lagado
        float num = 910.0f; 
        double number = num; // implicit type conversion (automatic)
        float num1 = (float)number ; // explicit type conversion (forcefully) - kyunki double data type ko float me store nhi krta java. isliye uski value ko float banakar type convert hota hian . 
        // ye  conversion java nhi krta isko hum krta hain kyunki isme data loss ho sakta hian

        // System.out.println(newNum);
    }
}


// implicit type casting (Widening Casting) (automatic) --  converting the smaller type data to the bigger type data.  
// eg - byte -> short -> int -> long -> float -> double

// explicit type casting (Narrow Casting) (manual/forcefully) - converting the bigger type data to the smaller type data.
// eg - double -> float -> long -> int -> short -> byte

