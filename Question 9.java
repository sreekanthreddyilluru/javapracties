/*
Write a Java program that requires the user to enter a single character
from the alphabet. Print vowel or consonant, depending on user input. If
the user input is not a letter(between a and z or A and Z), or is a string of
length>1, print an error message.

Test Data
Input an alphabet: p
Expected output:
Input letter is consonant

*/
import java.util.*;

public class Question 9
{
public static void main(String args[]){
String s = "p";
s = s.toLowerCase();
boolean uppercase = s.charAt(0) >=65 && s.charAt(0) <=90;
boolean lowercase = s.charAt(0) >= 97 && s.charAt(0) <= 122;
boolean vowels = s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o")|| s.equals("u"); 
if(s.length()>1 ){
System.out.println("Error");
}
else if(!(uppercase || lowercase )){
System.out.println("Error");
}
else if (vowels){
System.out.println("Input letter is Vowel");
}
else{
System.out.println("Input letter is Consonant");
}
}
}


