// Uvozimo razred za delo z vrsto za delo (buffer) iz paketa za delo z vhodno-izhdno operacijami
// import java.io.BufferedReader;
import java.io.*;
import java.util.*;
/**
 * Razred za prikaz delovanja objektno orientiranega programiranjaa
 *
 *@author Kristjan Mestnik
 *@version Primer 19a - implementacija vmesnika
 */
public class HelloWorld {
	/**
	 * Statični atribut/lastnost za branje vhoda iz konzole (tipkovnice)
	 */
	 private static BufferedReader in;
	
	/**
	 * 
	 *Deklariramo Seznam objektov tipa PivskaSteklenica - kot lastnost/atribut razreda HelloWorld
	 */
	private static ArrayList<PivskaSteklenica> pivskeSteklenice;
	
	/**
	 * Glavna metoda progama. Začene se vedno ob zagonu.
	 *
	 * @param args Seznam agrumentov in ukazne vrstice
	 */
	public static void main(String[] args) {
		// Izpišemo pozdrav v konzolo
		System.out.println("Pozdravljeni, Svet!");
		
		// Inicializiramo objekt in za zajem podatkov iz tipkovnice preko konzole
		in  = new BufferedReader(new InputStreamReader(System.in));
		
		//Inicializiramo seznam pivskih steklenice
		pivskeSteklenice = new ArrayList<>();
		
		//Deklariramo in inicializiramo lastnosti steklenice
		String znamkaPiva = "";
		int velikostSteklenice = 500;
		double temperaturaSteklenice = 5.0;
		
		// Poskusimo prebrati iz ukazne konzole
		try {
			// vnos podatkov o pivski steklenici
			System.out.print("Vnesi znako piva: ");
			znamkaPiva = in.readLine();
			
			//Če gre za malo pivo, nastavi velikost na 330 ml - default=da
			System.out.print("Je pivo veliko (d/n)");
			
			// Preverimo ali je vnešena vrednost ENAKA (in ne ista) kot "n"
			if(in.readLine().equals ("n")){
				velikostSteklenice = 330;
			}	
			// vnos podatkov o pivski steklenici - temperatura 
			System.out.print("Vnesi temperaturo pivo: ");
			temperaturaSteklenice =  Double.parseDouble(in.readLine());
			
		}
		// Lovljenje in obravnava napake pri branju vrstice
		catch(Exception e){
			System.out.println("Napaka pri branju podatkov o steklenici piva: " + e);
		}
		
		
		// Ustvarimo objekt tipa Steklenica
		Steklenica plastenkaVode = new Steklenica(500, "Voda");
		
		// Ustvarimo objekt tipa PivskaSteklenica, glede na vneše podatke
		PivskaSteklenica mojePivo = new PivskaSteklenica(velikostSteklenice, znamkaPiva, temperaturaSteklenice);
		
		// Izpijemo požirek piva
		try {
		System.out.println("Po prvem požirku je v steklenici še " + mojePivo.izprazni(50));
		}
 		catch (Exception e) {
		System.out.println("Izjemapripraznjenjusteklenice: " + e);
		}

		mojePivo.odpri();

		try {
			System.out.println("Po drugem požirku je v steklenici še " + mojePivo.izprazni(50));
		
		//objekt dodamo v seznam
		pivskeSteklenice.add(mojePivo);
		
		//V seznam dodamo še nekaj anonimnih objektov
		pivskeSteklenice.add(new PivskaSteklenica(500, "Laško", 8.0));
		pivskeSteklenice.add(new PivskaSteklenica(500, "Laško", 8.0));
		pivskeSteklenice.add(new PivskaSteklenica(500, "Union", 8.0));
		
		//Izpišemo število steklenic na seznamu
		System.out.println("V seznamu je " + pivskeSteklenice.size() + "steklenic");
		
		// Odpremo vse steklenice na seznamu
		for(int c=0; c<pivskeSteklenice.size(); c++){
			
			//Odpremo trenutno pivsko steklenico
			pivskeSteklenice.get(c).odpri();
		}


			// Izpijemo požirek vode
			plastenkaVode.odpri();
			System.out.println("Po požirku vode je v plastenki še " + plastenkaVode.izprazni(30));
			}
 		catch (Exception e) {
			System.out.println("Izjemapripraznjenjusteklenice: " + e);
		}
	}
}