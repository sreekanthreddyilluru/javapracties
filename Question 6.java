/*
Write a Java method to find the smallest number among three numbers.
Test Data:
Input the first number: 25
Input the second number: 37
Input the third number: 29
Expected Output:
The smallest values is 25.0
*/
import java.util.*;

public class Question 6
{
public static void main(String args[]){
int input1 = 25;
int input2 = 37;
int input3 = 29;
if (input1<input2 && input1<input3){
System.out.println("The smallest Value is "+(float)input1);
}
else if(input2<input1 && input2<input3){
System.out.println("The Smallest Value is "+(float)input2);
}
else
System.out.println("The Smallest Value is "+(float)input3);
}
}