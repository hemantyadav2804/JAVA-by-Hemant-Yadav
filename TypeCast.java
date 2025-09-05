public class TypeCast {         
    public static void main(String[] args) {
        int n = (int) 5.90f;                          //Explecit Conversion
        float m = 90;                                  // Implecit conversion
        System.out.println(n); 
                System.out.println(m); 

    }
}


/*
Step-wise Explanation:

1. int n = (int) 5.90f;
   - 5.90f is a float.
   - (int) tells Java to convert float into int.
   - Decimal part is removed, so n = 5.

2. float m = 90;
   - 90 is an int.
   - Java automatically converts int → float.
   - So m = 90.0.

3. System.out.println(n);
   - Prints 5.

4. System.out.println(m);
   - Prints 90.0.
*/