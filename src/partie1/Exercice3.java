package partie1;
import java.util.Scanner;

public class Exercice3 {
       public static void main(String[] args) {
    	   int n;
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("entrer un nombre qui tu veux son table de multiplication :");
    	   n=sc.nextInt();
    	   
    	   for(int i=0;i<=10;i++) {
    		   System.out.println(n + " X " + i + " = " + n*i);
    	   }
       }
}
