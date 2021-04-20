package coursJava;
import java.util.ArrayList;
import java.util.List;

public class Planning extends Visite{

	List<Visite> tabvis = new ArrayList<Visite>();
	
	public Planning(){
		
	}
	public void ajoutVisite(Visite visite) {
		
		this.tabvis.add(visite);
	}
	public void DelVisite(Visite visite) {
        this.tabvis.remove(visite);
    }

	 public static void main(String[] arg) {
		 Visite V1 = new Visite("Paul","01/05/2014",14);
		 Visite V2 = new Visite("Arthur","11/12/2012",17);
		 Planning p1 = new Planning();
		 p1.ajoutVisite(V1);
		 p1.ajoutVisite(V2);
		 for(Visite s : p1.tabvis) {
	            System.out.println("Le visiteur est " + s.etudiants + ", il est venue le " + s.date + "  il à mis la note de " + s.note );
		 }
		 p1.DelVisite(V2);
		 for(Visite s : p1.tabvis) {
	            System.out.println("Le visiteur est l'etudiant " + s.etudiants + ", il est venue le " + s.date + "  il à mis la note de " + s.note );
		 }
	 }
	
}
