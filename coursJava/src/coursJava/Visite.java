package coursJava;
import tools.*;
/**
 * 
 * @author BurstRun
 *
 */
public class Visite {
	
	 String etudiants;
	 String date;
	 int note;
	 
	 /**
	  * 
	  * @param etudiants
	  * @param date
	  * @param note
	  */
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
	 /**
	  * 
	  * @param arg
	  */
	 public static void main(String[] arg) {
		 
		 Visite V1 = new Visite("","",0);
		 int i = 100;
		 String s = "145";
		 String nombre = String.valueOf(i);
		 int caracter = Integer.parseInt(s);
		 
		 Visite V2 = new Visite("Arthur","11/12/2012",17);
		 System.out.println(V1.etudiants);
		 System.out.println(V2.etudiants);
		 System.out.println(V2);
		 System.out.println(nombre);
		 System.out.println(caracter);
		 System.out.println(V2.date);
		 String [] test = V2.date.split("/");
		 System.out.println(test[2]);
		 MesDates Date1 = new MesDates(V2.date);
		 System.out.println("Date FR : "+Date1.getDate());
		 System.out.println("Date US : "+Date1.dateFRtoUS());
		 MesDates Date2 = new MesDates(Date1.dateFRtoUS());
		 System.out.println("Date FR : "+Date2.dateUStoFR()); 
		 
	 }
	
	
}
