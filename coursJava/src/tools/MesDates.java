package tools;
/**
 * 
 * @author gnorgol
 *
 */
public class MesDates {

	String date;
	/**
	 * Permet de convertir la date FR en US
	 * 
	 * @param date
	 */
	public MesDates(String date) 
	 {
		 this.date = date;
		 
	 }
	/**
	 * 
	 * @return
	 */
	public String dateFRtoUS() {
		
		String [] test = this.date.split("/");
		String jour,mois,annee,DateUS;
		jour = test[0];
		mois = test[1];
		annee = test[2];
		DateUS = mois + "/" + jour + "/" + annee ;
		return DateUS;
	}
	/**
	 * Permet de convertir la date US en FR
	 * @return
	 */
	public String dateUStoFR() { 
		
		String [] test = this.date.split("/");
		String jour,mois,annee,DateFR;
		jour = test[1];
		mois = test[0];
		annee = test[2];
		DateFR = jour + "/" + mois + "/" + annee ;
		return DateFR;
	}
	
	public String getDate() {
		 return this.date;
		 
	 }
	
}
