/**
 * Razred za prikaz modela steklenice, ki vsebuje tekočino
 *
 *@author Kristjan Mestnik
 *@version Primer 19a - implementacija vmesnika
 */
 public class Steklenica {
	 
	 //Deklariramo lastnosti
	 /**
	  * Kapaciteta steklenice v litrih
	  */
	 private int kapaciteta;
	 
	 /**
	  * Stanje odprtosti:
	  *true - odprta
	  * false - zaprta
	  */
	 private boolean jeOdprta;
	 
	 /**
	  * Trenutna količina vsebine
	  */
	  private int kolicinaVsebine;
	 
	 /**
	  * Trenutna Vrsta vsebine
	  */
	  private String vrstaVsebine;
	 
	 /**
	  * Konstruktor za inicializacijo nove steklenice, ki je polna in zaprta
	  * Inicializira vse lastnosti
	  * @param k Kapaciteta steklenice (ml)
	  * @param v Vrsta vsebine steklenice
	  */
	  
	  public Steklenica(int k, String v){
		
		// Inicializiramo vse lastnosti
		this.kapaciteta = k;
		this.jeOdprta = false;
		this.kolicinaVsebine = k;
		this.vrstaVsebine = v;
		
		//Izpišemo podatke o steklenici
		System.out.println("Ustvarjam stekelnico " + v + " kapacitete " + k + "ml.");
		
	  }
	  
	  /**
	  * Metoda, ki iz steklenice izprazni določeno količino vsebine
	  * @return uspešnost odpiranja
	  * true - prej je bila zaprta
	  * false - še prej je bila odprta
	  */
	  public boolean odpri() {
		  
		  // Če je steklenica že odprta
		  if(jeOdprta){
			  return false;
		  }
		  // Če steklenica še ni odprta
		  else {
			  
			  // Odpre steklenico
			  jeOdprta = true;
			  System.out.println("Odpiram stekelnico" + vrstaVsebine + ".");
			  return true;
		  }
	  }
	  
	  /**
	  * Metoda, ki iz steklenice izprazni določeno količino vsebine
	  * @param k Količino vsebine, ki jo želimo izprazniti (ml)
	  * @return Količina vsebine, ki je ostala v steklenici po praznenju
	  * @throws Exception če je steklenica zaprta, ko jo skušamo izprazniti
	  */
	  public int izprazni(int k) throws Exception {
		  
		  // Če je steklenica odprta
		  if(jeOdprta){
			  
			  // Količino vsebine zmanjšamo za želeno količino
			  System.out.println("Iz steklenice v kateri je " + kolicinaVsebine + "ml " + vrstaVsebine + " praznim " + k + "ml.");
			  kolicinaVsebine -= k;
			  
			  //Preverimo, če se je količina slučajno preveč zmanjšala
			  if(kolicinaVsebine <= 0) {
				  
				  // Postavimo kočino vsebine na 0
				  kolicinaVsebine = 0;
				  System.out.println("Steklenica" + vrstaVsebine + " je prazna.");
			  }
		  }
		  
		  // Če je steklenica zaprta
		  else{
			  
			  //Vrže izjemo
			  throw new Exception("Ne morem izprazniti steklenice, ker je zaprta.");
			 
		  }
		  // Vrnemo količino vsebine po praznenju
		  return kolicinaVsebine;
	  }
 }