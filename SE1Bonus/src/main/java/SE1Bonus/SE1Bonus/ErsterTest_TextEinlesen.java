package SE1Bonus.SE1Bonus;

import java.io.*;
//import java.io.BufferedReader;
//import java.io.FileReader;

public class ErsterTest_TextEinlesen {

	public static void main(String[] args) throws IOException {
		String file_name = "input.txt";
		String search_for = "red";
//eine Änderung
//noch eine Änderung
		//String file_path = "C:\\Users\\km\\workspace\\textdatei_laden\\src\\main\\java\\hdm\\stuttgart\\mi\\se1\\test\\textdatei_laden\\" + file_name;
		String file_path = "src\\main\\java\\SE1Bonus\\SE1Bonus\\" + file_name;
		
		FileReader file_reader = new FileReader(file_path);
		BufferedReader buffered_reader = new BufferedReader(file_reader);

		// Suche
		String zeile = "";
		boolean help = false;

		while ((zeile = buffered_reader.readLine()) != null) {// solange .readLine nicht null zurück gibt, lade Inhalt von buffered_reader in String zeile
			for(int i = 0; i < zeile.length(); i++){
				for(int k = 0; k < search_for.length(); k++){
					if((i+k) < zeile.length()){ //Fall abfangen, in dem zeile.charAt(i+k) außerhalb von zeile.lenght() ist.
						if(zeile.charAt(i+k) == search_for.charAt(k)){
							help = true;
						}else{
							help = false;
						}
					}
				}

				if(help == true){
					System.out.println(search_for + " enthalten");
				}
			}
			System.out.println("\nZeilenumbruch \n");
		}

		// Im string Text ist der gesamte Text aus der Textdatei abgelegt
		buffered_reader.close();

	}

}
