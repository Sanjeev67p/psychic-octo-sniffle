import java.util.*;
public class p3{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the digit: ");
    int n= sc.nextInt();
    System.out.println("Fibonacci series: ");
    System.out.println("0\n1\n1");
    int a=1;
    int b=1;
    for(int i=1; i<n; i++ ){
      int k=a+b;
      a=b;
      System.out.println(k); 
      b=k;
    }
    
  }
}