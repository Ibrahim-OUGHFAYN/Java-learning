package partie6;

class Livre {
    String isbn;
    String titre;
    String auteur;
    int annee;

    public Livre(String isbn, String titre, String auteur, int annee) {
        this.isbn = isbn;
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
    }

    @Override
    public String toString() {
        return isbn + " | " + titre + " | " + auteur + " | " + annee;
    }
}