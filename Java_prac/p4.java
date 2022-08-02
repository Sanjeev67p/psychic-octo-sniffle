import java.util.*;
public class p4{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter first element: ");
    int first= sc.nextInt();
    System.out.println("Enter last element: ");
    int last= sc.nextInt();
    for(; first<=last; first++){
    	int flag=0;
      	for(int i=2; i<first;i++){
        	if(first==0||first==1){
        	  flag=0;
        	  break;
        	}
        	else if(first%i==0){
        	flag=0;
         	break;
        	}
        	else{
        	flag=1;
        	}
      	}
      	if(flag==1){
      	  System.out.println(first);
      	}
    }
  }
}