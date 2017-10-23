package numeros;

public class Seis extends NumberAsDisplay{
	
	public Seis(int escala) {
		super(escala);
	}
	
	@Override
	public void montaDisplay(){
		for(int i = 0; i < escala; i ++){
			montaParte1(i);
			montaParte2(i);
			montaParte3(i);
		}
		display = " " + parte1 + "\n"
				+ parte2
				+ parte3; 
	}

	@Override
	public String montaParte1(int indice) {
		return parte1 += "_";
	}

	
	@Override
	public String montaParte2(int indice) {
		if(indice + 1 == escala){
			return parte2 += "|" + parte1 + "\n";
		}
		return parte2 +=   "|\n";
	}
	
	@Override
	public String montaParte3(int indice) {
		if(indice + 1 == escala){
			return parte3 += "|" + parte1 + "|\n";
		}
		return parte3 += "|" + espacosEmBranco + "|\n";
	}

}
