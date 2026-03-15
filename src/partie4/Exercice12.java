package partie4;
import java.util.Scanner;

public class Exercice12 {

	public static void main(String[] args) {
		
		String voyelle="aeiouyAEIOUY";
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter le String");
		String str=sc.nextLine();
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			if(voyelle.contains(String.valueOf(str.charAt(i)))){
				count++;
			}
		}
		System.out.println("dans ce chain de cararcter il y a "+ count +" voyelles");
	}

}


