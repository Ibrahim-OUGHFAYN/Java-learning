package partie1;
import java.util.Scanner;

public class Exercice4 {
	
	public static void main(String[] args) {
		int n,i=0,some=i;
		Scanner sc=new Scanner(System.in);
		System.out.println("entrer un entier:");
		n=sc.nextInt();
		
		while(n>=i){
			some+=i;
			i++;
		}
		
		System.out.println("la somme est"+some);
	}

}
