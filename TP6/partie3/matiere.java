package partie3;

public class matiere implements Comparable<matiere> {
    int id;
    String nom;

    public matiere(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public void afficher() {
        System.out.println(id + " " + nom);
    }

    public int compareTo(matiere other) {
        return this.nom.compareTo(other.nom); 
    }
}


