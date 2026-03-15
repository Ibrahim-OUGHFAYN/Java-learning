package partie1;
import java.util.Scanner;

public class Exercice2 {
	public static void main(String[] args) {
		int n1,n2,n3,max;	
	    Scanner sc=new Scanner(System.in);
	    System.out.println("entrer le premier nombre");
	    n1=sc.nextInt();
	    
	    System.out.println("entrer le deuxiemme nombre");
	    n2=sc.nextInt();
	    
	    System.out.println("entrer le troisieme nombre");
	    n3=sc.nextInt();
	   
	    max=n1;
	    if(max<n2) {
	    	max=n2;
	    }
	    if(max<n3) {
	    	max=n3;
	    }
	    System.out.println("le max est :" + max);
	}
}
