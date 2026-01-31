public class expression {
    public static void main(String[] args) {
        int d = 56;
        float f = 34.2f;
        double g = 547.75;
        char c = 'a';
        long e = 45;
        byte a = 4;
        short b = 67;

        // expression me bhi type casting hoti hain 
        // int , char, short, byte - expression me sabhi values int me convert ho jayegi 
        // float,long,double - expression me sabhi values jo in me se highest type ka hoga usme convert ho jayega . (jese long+float hain jo inmese highest size ka hoga usme convert ho jayega) 

        int exp1 = a+b+c+d; // convert all value to int  
        double exp2 = e+f+g; // covert all value to higher data type jo ki is case me double hain

        
    }
}
