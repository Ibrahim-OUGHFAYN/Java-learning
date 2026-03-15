package partie2;
import java.util.Scanner;

public class Exercice7 {
	public static void main(String[] args) {
		int N,max;
		Scanner sc=new Scanner(System.in);

		System.out.println("entrer la taille de tableau:");
		N=sc.nextInt();

		int[] T=new int[N];
		
		for(int i=0;i<N;i++) {
			System.out.println("entrer l'element "+i+" :");
			T[i]=sc.nextInt();
		}
		max=T[0];
		for(int i=1;i<N;i++) {
			if(T[i]>max) {
				max=T[i];
			}
		}
		System.out.println("le max dans le tab est :"+max);
	}
}
