package main;

import static helper.PrintHelper.getAllNumbers;
import static helper.PrintHelper.printColumns;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import helper.EntradaParser;
import numeros.NumberAsDisplay;

public class Main {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int escala = new Scanner(System.in).nextInt(); 	
		String numero = new Scanner(System.in).next();
		
		List<NumberAsDisplay> listaDisplay = EntradaParser.parse(numero, escala);
		
		List<String> todosOsNumerosList = new ArrayList<>();
		
		String[] todosOsNumerosAsArray = getAllNumbers(listaDisplay, todosOsNumerosList);
		
		System.out.println(printColumns(todosOsNumerosAsArray));
	}
	
}                                                     