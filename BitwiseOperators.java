//Bitwise operators

public class BitwiseOperators {
    public static void main(String[] args) {
        int num1 = 10, num2 = 12;
        System.out.println("AND: " + (num1 & num2));
        System.out.println("OR: " + (num1 | num2));
        System.out.println("XOR: " + (num1 ^ num2));
        System.out.println("NOT: " + (~num1));
        System.out.println("Left shift: " + (num1 << 1));
        System.out.println("Right shift: " + (num1 >> 1));
    }
}

