//Logical Operators

public class LogicalOperations {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 12;
        int num3 = 22;

        // Logical AND
        System.out.println((num1 > num2) && (num1 < num3));
        

        // Logical OR
        System.out.println((num1 > num2) || (num1 > num3));
        

        // Logical NOT
        System.out.println(!(num1 > num2));
        
    }
}

