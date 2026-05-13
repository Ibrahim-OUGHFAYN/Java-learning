package partie5;

import java.util.TreeMap;
import java.util.Map;

public class part {
    public static void main(String[] args) {

        // 1. Création du TreeMap
        TreeMap<Integer, String> etudiants = new TreeMap<>();

        // 2. Ajouter plusieurs étudiants (clé = numéro, valeur = nom)
        etudiants.put(105, "Ali");
        etudiants.put(98, "Sara");
        etudiants.put(150, "Youssef");
        etudiants.put(120, "Imane");
        etudiants.put(80, "Omar");

        // 3. Afficher la liste triée automatiquement
        System.out.println("Liste triée des étudiants :");
        for (Map.Entry<Integer, String> entry : etudiants.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 4. Afficher le premier et le dernier étudiant
        System.out.println("\nPremier étudiant (plus petit ID) : " 
                + etudiants.firstEntry().getKey() + " -> " + etudiants.firstEntry().getValue());

        System.out.println("Dernier étudiant (plus grand ID) : " 
                + etudiants.lastEntry().getKey() + " -> " + etudiants.lastEntry().getValue());

        // 5. Extraire les étudiants ayant un numéro > 100
        System.out.println("\nÉtudiants avec ID > 100 :");
        for (Map.Entry<Integer, String> entry : etudiants.tailMap(101).entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
