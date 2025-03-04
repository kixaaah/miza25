import javax.swing.table.*;

/**
 * Razred za delo s tabelo pivskih steklenic
 * Razširja privzeti razred za tabele
 *
 *@author Kristjan Mestnik
 *@version Primer 20 - GUI
 *
 */
 
 public class PivskaSteklenicaTableModel extends DefaultTableModel{
	 
	 /**
	  * Konstruktor, ki ustvari tabelo steklenic na mizi
	  */
	  public PivskaSteklenicaTableModel(){
		  
		  //Pokličemo konstruktor nadrazreda
		  super();
		  
		  //Dodamo stolpce v tabelo
		  addColumn("Znamka");
		  addColumn("Stopnja alkohola");
		  
		  //Ustvarimo seznam objektov nizov ki predstavljajo vrstico tabele
		  Object[] vrstica = new Object[]{"Testna znamka", "5.0"};
		  
		  //vrstico ustavimo v tabelo
		  addRow(vrstica);
	  }
	  
	  /**
	   * Javna metoda, ki doda pivsko steklenico v tabelo
	   *@param ps Objekt, ki ga dodamo  v tabelo
	   */
	  public void addPivskaSteklenica(PivskaSteklenica ps){
		  
		   //Ustvarimo seznam objektov nizov ki predstavljajo vrstico tabele
		  Object[] vrstica = new Object[]{ps.getZnamka(), ps.getStopnjaAlkohola()};
		  
		  //vrstico ustavimo v tabelo
		  addRow(vrstica);
		  
	  }
 }