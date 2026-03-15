package partie3;
import java.util.Scanner;

public class Exercice9 {
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
		
		int somme=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				somme+=M[i][j];
			}
		}
		
		System.out.println("la somme est:"+ somme);
	}
}


