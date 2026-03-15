package partie2;
import java.util.Scanner;

public class Exercice5 {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entrer la taillle de tableau");
		int n=sc.nextInt();
		int[] T=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("entrer l'element numero " + i + ":");
			T[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			System.out.print("---" + T[i]);
		}
		
		sc.close();
	}

}
