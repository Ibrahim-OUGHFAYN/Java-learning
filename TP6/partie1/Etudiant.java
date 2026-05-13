package partie1;

public class Etudiant {
      private int id;
      private String nom;
      private double moyenne;
      
      public Etudiant(int id,String nom,double moyenne) {
    	       this.id=id;
    	       this.nom=nom;
    	       this.moyenne=moyenne;
      }
      
      public int getId() {
    	         return this.id;
      }
      public String getNom() {
    	         return this.nom;
      }
      public double getMoyenne() {
    	         return this.moyenne;
      }
      
      public void setId(int id) {
    	         this.id=id;
      }
      public void setNom(String nom) {
    	         this.nom=nom;
      }
      public void setMoyenne(double moyenne) {
    	         this.moyenne=moyenne;
      }
      
      public void afficher() {
    	         System.out.println("l'etudiant de i'id :"+this.id+", nom:"+this.nom+",moyenne :"+this.moyenne);
      }
}
