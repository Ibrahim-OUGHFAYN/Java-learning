package partie6;

import java.util.*;


public class Bibliotheque {

    public static void main(String[] args) {

        // 1. ArrayList pour stocker les livres
        ArrayList<Livre> livres = new ArrayList<>();

        livres.add(new Livre("ISBN001", "Clean Code", "Robert Martin", 2008));
        livres.add(new Livre("ISBN002", "Design Patterns", "GoF", 1994));
        livres.add(new Livre("ISBN003", "Java Basics", "John Doe", 2020));
        livres.add(new Livre("ISBN004", "Spring Boot", "Pivotal", 2021));

        // 2. HashSet pour les catégories
        HashSet<String> categories = new HashSet<>();
        categories.add("Programmation");
        categories.add("Architecture");
        categories.add("Backend");

        // 3. HashMap étudiant -> livre emprunté
        HashMap<String, String> emprunts = new HashMap<>();
        emprunts.put("Ali", "ISBN001");
        emprunts.put("Sara", "ISBN003");

        // 4. Recherche d’un livre
        String recherche = "Design Patterns";
        System.out.println("🔍 Recherche du livre : " + recherche);

        for (Livre l : livres) {
            if (l.titre.equalsIgnoreCase(recherche)) {
                System.out.println("Trouvé : " + l);
            }
        }

        // 5. Supprimer un livre
        String isbnSupprimer = "ISBN002";
        livres.removeIf(l -> l.isbn.equals(isbnSupprimer));
        System.out.println("\n❌ Livre supprimé : " + isbnSupprimer);

        // 6. Afficher tous les livres disponibles
        System.out.println("\n📚 Livres disponibles :");
        for (Livre l : livres) {
            System.out.println(l);
        }

        // 7. Rapport final
        System.out.println("\n📊 RAPPORT FINAL");
        System.out.println("Nombre de livres : " + livres.size());
        System.out.println("Catégories : " + categories);
        System.out.println("Emprunts : " + emprunts);

        System.out.println("\n📖 Détail des emprunts :");
        for (Map.Entry<String, String> entry : emprunts.entrySet()) {
            System.out.println(entry.getKey() + " a emprunté ISBN = " + entry.getValue());
        }
    }
}