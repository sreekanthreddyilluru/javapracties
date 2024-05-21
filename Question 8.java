/*
Write a java program to solve quadratic equations (use if, else if and else)
Test Data
Input a: 1
Input b: 5
Input c: 1
Expected output: The roots are -0.20871215252208009
And -4.7912878474779195

*/

import java.util.*;

public class Question 8
{
public static void main(String[] Strings) {
int a = 1;
int b = 5;
int c = 1;
double result = b * b - 4.0 * a * c;
if (result > 0.0) {
double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
System.out.println("The roots are " + r1 + " and " + r2);
} else if (result == 0.0) {
double r1 = -b / (2.0 * a);
System.out.println("The root is " + r1);
} else {
 System.out.println("The equation has no real roots.");
}
}
}