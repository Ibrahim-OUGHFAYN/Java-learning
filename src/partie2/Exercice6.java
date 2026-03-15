package partie2;
import java.util.Scanner;

public class Exercice6 {
	public static void main(String[] args) {
		int[] T=new int[10];
		int n;
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			System.out.println("entrer l'element "+i+" :");
			T[i]=sc.nextInt();
		}
		
		System.out.println("entrer un nombre a la recherche:");
		n=sc.nextInt();
		
		System.out.println("le nombre exist a l'index ou les indices suivants:");
		for(int i=0;i<10;i++) {
			if(T[i]==n) {
				System.out.print(i+"-");
			}
		}
		
	}
}
