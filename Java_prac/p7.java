import java.util.Scanner;
public class p7{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Marks");
    System.out.println("English: ");
    int a= sc.nextInt();
    System.out.println("Hindi: ");
    int b= sc.nextInt();
    System.out.println("Mathematics: ");
    int c= sc.nextInt();
    System.out.println("Science: ");
    int d= sc.nextInt();
    System.out.println("Social Science: ");
    int e= sc.nextInt();
    System.out.println("Result of the student is: "+ (b+c+d+e+a)/5 + " %");
    
      }
} 