package partie1;
import java.util.Scanner;

public class Exercice1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entrer un nombre");
		int nombre=sc.nextInt();
		
		if(nombre>0) {
			System.out.println("positive");
		}else if(nombre<0) {
			System.out.println("negative");
		}else {
			System.out.println("null");
		}
		
	}
}
