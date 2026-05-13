package partie4;

import java.util.HashMap;
import java.util.Map;

public class parte{
    public static void main(String[] args) {

        // Création du HashMap
        HashMap<String, Double> notes = new HashMap<>();

        // Ajouter des étudiants avec leurs notes
        notes.put("Ali", 15.5);
        notes.put("Sara", 18.0);
        notes.put("Youssef", 12.75);
        notes.put("Imane", 16.25);

        // Afficher toutes les notes
        System.out.println("Liste des notes :");
        for (Map.Entry<String, Double> entry : notes.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Rechercher la note d’un étudiant
        String etudiantRecherche = "Sara";
        if (notes.containsKey(etudiantRecherche)) {
            System.out.println("\nNote de " + etudiantRecherche + " : " + notes.get(etudiantRecherche));
        } else {
            System.out.println("\nÉtudiant non trouvé");
        }

        // Modifier la note d’un étudiant
        notes.put("Ali", 17.0); // modification directe
        System.out.println("\nNouvelle note de Ali : " + notes.get("Ali"));

        // Supprimer un étudiant
        notes.remove("Youssef");
        System.out.println("\nAprès suppression de Youssef : " + notes);

        // Calcul de la moyenne générale
        double somme = 0;
        for (double note : notes.values()) {
            somme += note;
        }

        double moyenne = notes.size() > 0 ? somme / notes.size() : 0;

        System.out.println("\nMoyenne générale de la classe : " + moyenne);
    }
}