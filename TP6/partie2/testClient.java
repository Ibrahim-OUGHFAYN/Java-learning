package partie2;
import java.util.LinkedList;

public class testClient {
      public static void main(String[] args) {
    	  LinkedList<client> clts=new LinkedList<>();
    	  
    	  
    	  //l'ajout des clients
    	  clts.add(new client(1,"brahim"));
    	  clts.add(new client(2,"ahmed"));
    	  clts.add(new client(3,"mustapha"));
    	  
    	  //l'affichage 
    	  for(client c:clts) {
    		  c.afficher();
    	  }
    	  
    	  //l'affichage de premier client
    	  System.out.println("voila la premier client avec la method getfirst");
    	  clts.getFirst().afficher();
    	  
    	  //l'ajout a le dernier et l'afficher
    	  clts.addLast(new client(4,"mohmed"));
    	  clts.getLast().afficher();
    	  
    	  // le cliennt en tet de file c'est la premier client 
    	  System.out.println("le cliennt en tet de file c'est la premier client ");
    	  clts.getFirst().afficher();
    	   
      }
}

