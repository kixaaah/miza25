/**
 * Razred za prikaz uporabe dedovanja
 * Razširja razred Steklenica
 *
 *@author Kristjan Mestnik
 *@version Primer 20 - GUI
 */
 public class PivskaSteklenica extends Steklenica implements AlkoholnaPijaca {
	 
	 // Vse lastnosti od nadrazreda se prenesejo
	 // Deklariramo dodatne lastnosti, ki so skupne le pivskim steklenicam
	 
	 /**
	  * Znamka piva
	  *
	  */
	  private String znamka;
	  
	  /**
	   * Temperatura piva v steklenici (v stopinjah celzija) 
	   */
	  private double temperatura;
	  
	  /**
	   * Stopnja alkohola piva (v odstotkih ne deležih)
	   */
	  private double stopnjaAlkohola;
	  
	 /**
	  * Konstruktor za inicializacijo nove pivske steklenice, ki je polna in zaprta
	  * Inicializira vse lastnosti
	  * @param k Kapaciteta steklenice (ml)
	  * @param z Znamka piva
	  * @param t Začetna temperatura steklenice ( v stopinjah celcija)
	  * @param s Stopnja alkohola  (v odstotkih)
	  */
	  
	  public PivskaSteklenica(int k, String z, double t, double s){
		  
		  //Pokličemo konstruktor nadrazreda - Steklenica
		  // ki bo inicializiral lstnosti nadrazreda
		  super(k, "Pivo");
		  
		  // Inicializiramo dodatne lastnosti razreda
		  znamka = z;
		  temperatura = t;
		  stopnjaAlkohola = s;
		  System.out.println("Pivska steklenica je znamke" + z + "s stopnjo alkohola" + s + "%.");
	  }
		
	  
	 /**
	  * Konstruktor za inicializacijo nove pivske steklenice, ki je polna in zaprta
	  * Inicializira vse lastnosti
	  * @param k Kapaciteta steklenice (ml)
	  * @param z Znamka piva
	  * @param t Začetna temperatura steklenice ( v stopinjah celcija)
	  */
	  
	  public PivskaSteklenica(int k, String z, double t){
		  
		  // Pokličemo drug konstruktor z default vrednostjo
		  this(k, z, t, 4.5);
		 
	  }	
	
	/**
	  * Konstruktor za inicializacijo nove pivske steklenice, ki je polna in zaprta
	  * Inicializira vse lastnosti
	  * @param k Kapaciteta steklenice (ml)
	  * @param z Znamka piva
	  */
	  
	  public PivskaSteklenica(int k, String z){
		  
		  // Pokličemo drug konstruktor
		  this(k, z, 8.0);
		 
	  }	
	  
	  /**
	   * Metoda predpisana z vmesnikom AlkoholnaPijaca
	   * Vrne stopnjo alkohola v odstotkih
	   */
	  public double getStopnjaAlkohola(){
		  return stopnjaAlkohola;
	  }  
	  
	  /**
	   * Metoda vrne znamko piva
	   *@return znamka piva
	   */
	  public String getZnamka(){
		  return znamka;
	  }  
}