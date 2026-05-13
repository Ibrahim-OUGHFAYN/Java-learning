package partie1;
import java.util.ArrayList;
import java.util.Scanner;

public class testEtudiant {
	public static void main(String[] args) {
		
		ArrayList<Etudiant> etds=new ArrayList<>();
		Etudiant etd1=new Etudiant(1,"brahim oughfayn",16);
		Etudiant etd2=new Etudiant(2,"ahmad mahmoud",17);
		Etudiant etd3=new Etudiant(3,"lin houda",10);
		Etudiant etd4=new Etudiant(4,"mustapha kech",9);
		Etudiant etd5=new Etudiant(5,"ali boudwar",5.99);
		
		etds.add(etd1);
		etds.add(etd2);
		etds.add(etd3);
		etds.add(etd4);
		etds.add(etd5);
		
		//l'affichage
		for(Etudiant e : etds) {
			e.afficher();
		}
		
		//la recherche
		Scanner sc=new Scanner(System.in);
		System.out.print("entrer un nom a rechercher : ");
		String nom=sc.nextLine();
		boolean pas_trouvee=true;
		for(Etudiant e : etds) {
			if (e.getNom().equals(nom)) {
				System.out.println("l'etudiant rechercher est trouver et voila son info complete :");
				e.afficher();
				pas_trouvee=false;
				break;
			}
		}
		if(pas_trouvee) {
			System.out.println("l'etudiant a ce nom n'est pas trouvee");
		}
		
		//la supprission		
		pas_trouvee=true;
		System.out.print("entrer l'id d'etudiant a suprimee : ");
		int id=sc.nextInt();
		for(Etudiant e : etds) {
			if (e.getId()==id) {
				etds.remove(e);
				System.out.println("etudiant suprimeee.");
				pas_trouvee=false;
				break;
			}
		}
		if(pas_trouvee) {
			System.out.println("l'etudiant a cette id n'est pas trouvee");
		}
		
		//le triage
		etds.sort((e1, e2) -> Double.compare(e1.getMoyenne(), e2.getMoyenne()));
		//l'affichage apres le triage
		for(Etudiant e:etds) {
			e.afficher();
		}
		
		//l'affichage d'etudiant de mielleur moyen
		Etudiant emax=new Etudiant(0,"hey",0);
		for(Etudiant e:etds) {
			if(e.getMoyenne()>emax.getMoyenne()) {
				emax=e;
			}
		}
		
		System.out.println("l'etudiant ayant le mieulleur moyenne ");
		emax.afficher();
	}
}
