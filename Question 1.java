import java.util.*;
public class Question1{
public static void main(String args[]){
int arr[] = {1,10,20,30,40};
int n = arr.length;
if (n == 1){
System.out.println(arr[0]);
}
if (arr[0]>= arr[1]){
System.out.println(arr[0]);
}
if (arr[n - 1] >= arr[n - 2]){
System.out.println(arr[n-1]);
}
for (int i =1; i<n-1; i++){
if (arr[i] >= arr[i-1] && arr[i]>=arr[i+1])
System.out.println(arr[i]);
}
}
}

