/*
Write a java program to make such a pattern like a right angle triangle
with the number increased by 1.
The pattern like:
1
2 3
4 5 6
7 8 9 10
*/
import java.util.*;

public class Question 10
{
public static void main(String args[]){
int a = 1;
int n = 5;
for (int i = 1 ; i<=n ; i++){
for (int j = 1 ; j<i ; j++){
System.out.print(a +" ");
a++;
}
System.out.println(" ");
}
}}

