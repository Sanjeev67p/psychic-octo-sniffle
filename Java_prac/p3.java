import java.util.*;
public class p3{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the digit: ");
    int n= sc.nextInt();
    System.out.println("Fibonacci series: ");
    System.out.println("0");
    int a=1;
    for(int i=1; i<n; i++ ){
      System.out.println(a);
      a+=a;
    }
    
  }
}