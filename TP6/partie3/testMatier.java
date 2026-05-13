package partie3;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class testMatier {
    public static void main(String[] args) {
        
        // Ajouter plusieurs matières dans un HashSet
        Set<matiere> hashSetMatieres = new HashSet<>();
        
        hashSetMatieres.add(new matiere(1,"math"));
        hashSetMatieres.add(new matiere(2,"fr"));
        hashSetMatieres.add(new matiere(3,"en"));
        hashSetMatieres.add(new matiere(4,"info"));
        
        //  Vérifier qu’aucun doublon n’existe 
        boolean estAjoute = hashSetMatieres.add(new matiere(1,"math"));
        
        if (!estAjoute) {
            System.out.println("Tentative d'ajout d'un doublon détectée");
        }

        // Afficher les matières 
        System.out.println("Contenu du HashSet:");
        for(matiere m:hashSetMatieres) {
        	m.afficher();
        }

        // Copier les matières dans un TreeSet
        // Le constructeur de TreeSet peut prendre une collection en argument
        Set<matiere> treeSetMatieres = new TreeSet<>(hashSetMatieres);

        // 5. Afficher les matières triées par ordre alphabétique
        System.out.println("\nContenu du TreeSet (trié par ordre alphabétique) :");
        for (matiere m : treeSetMatieres) {
            m.afficher();
        }
    }
}