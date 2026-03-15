package partie3;
import java.util.Scanner;

public class Exercice8 {
	public static void main(String[] args) {
		int[][] M=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("la lecture de matrice:");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("entrer M("+i+","+j+")");
				M[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("l'affichage de matrice:");

		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(M[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
