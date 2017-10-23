package helper;

import java.util.List;

import numeros.NumberAsDisplay;

public class PrintHelper {
	
	public static String printColumns(String[] input) {
		  String result = "";

		    // Split input strings into columns and rows
		    String[][] columns = new String[input.length][];
		    int maxLines = 0;
		    for (int i = 0; i < input.length; i++) {
		        columns[i] = input[i].split("\n");
		        if (columns[i].length > maxLines)
		            maxLines = columns[i].length;
		    }

		    // Store an array of column widths
		    int[] widths = new int[input.length];
		    // calculate column widths
		    for (int i = 0; i < input.length; i++) {
		        int maxWidth = 0;
		        for (int j = 0; j < columns[i].length; j++)
		            if (columns[i][j].length() > maxWidth)
		                maxWidth = columns[i][j].length();
		        widths[i] = maxWidth + 1;
		    }

		    // "Print" all lines
		    for (int line = 0; line < maxLines; line++) {
		        for (int column = 0; column < columns.length; column++) {
		            String s = line < columns[column].length ? columns[column][line] : "";
		            result += String.format("%-"+widths[column]+"s", s);
		        }
		        result += "\n";
		    }
		    return result;
		}
	
	

	public static String[] getAllNumbers(List<NumberAsDisplay> listaDisplay, List<String> todosOsNumerosList) {
		for (NumberAsDisplay numberAsDisplay : listaDisplay) {
			todosOsNumerosList.add(numberAsDisplay.getDisplay());
		}
		
		String[] todosOsNumerosAsArray = new String[todosOsNumerosList.size()];
		todosOsNumerosAsArray = todosOsNumerosList.toArray(todosOsNumerosAsArray);
		return todosOsNumerosAsArray;
	}

}
