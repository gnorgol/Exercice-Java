package coursJava;
public class Visite {
	
	 String etudiants;
	 String date;
	 int note;
	 
	 
	 public Visite(String etudiants, String date ,int note ) 
	 {
		 this.etudiants = etudiants;
		 this.date = date;
		 this.note = note;
		 
	 }
	 String getEtudiants() {
		 
		 return this.etudiants;
		 
		 
	 }
	 String getDate() {
		 
		 return this.date;
		 
		 
	 }
	 public String toString() {
		 
		 return "Etudiant : "+this.etudiants+" date : "+this.date+" note : "+this.note;
		 
		 
	 }
	 void setEtudiant(String etudiant) {
		 this.etudiants = etudiants; 
		 
	 }
	 void setDate(String date) {
		 this.date = date; 
		 
	 }
	 void setEtudiant(int note) {
		 this.note = note; 
	 }
	 int getNote() {
	 
	 return this.note;
	 
	 
}
	 public static void main(String[] arg) {
		 
		 Visite V1 = new Visite("","",0);
		 Visite V2 = new Visite("Arthur","12-12-2012",17);
		 System.out.println(V1.etudiants);
		 System.out.println(V2.etudiants);
		 System.out.println(V2);
		 
	 }
	
	
}
