package partie2;

public class client {
      public int numero;
      public String nom;
      
      public client (int numero,String nom) {
    	  this.numero=numero;
    	  this.nom=nom;
      }
      public void afficher() {
    	  System.out.println("client : "+this.nom+" , numero :" +this.numero);
      }
}




