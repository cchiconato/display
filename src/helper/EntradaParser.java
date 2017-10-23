package helper;

import java.util.ArrayList;
import java.util.List;

import numeros.Cinco;
import numeros.Dois;
import numeros.Nove;
import numeros.NumberAsDisplay;
import numeros.Oito;
import numeros.Quatro;
import numeros.Seis;
import numeros.Sete;
import numeros.Tres;
import numeros.Um;
import numeros.Zero;

public class EntradaParser {
	
	private static List<NumberAsDisplay> listaDisplay = new ArrayList<>();
	
	public static List<NumberAsDisplay> parse(String numero, int escala){
		String[] split = numero.split("(?<=.)");
		for (String string : split) {
			switch(Integer.parseInt(string)){
			 case 1 :
				 listaDisplay.add(new Um(escala));
				 break;
			 case 2 :
				 listaDisplay.add(new Dois(escala));
				 break;
			 case 3 :
				 listaDisplay.add(new Tres(escala));
				 break;
			 case 4 :
				 listaDisplay.add(new Quatro(escala));
				 break;
			 case 5 :
				 listaDisplay.add(new Cinco(escala));
				 break;
			 case 6 :
				 listaDisplay.add(new Seis(escala));
				 break;
			 case 7 :
				 listaDisplay.add(new Sete(escala));
				 break;
			 case 8 :
				 listaDisplay.add(new Oito(escala));
				 break;
			 case 9 :
				 listaDisplay.add(new Nove(escala));
				 break;
			   default:
				   listaDisplay.add(new Zero(escala));
			}
 
		}
				
		return listaDisplay;
	}
}
