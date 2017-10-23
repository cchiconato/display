package numeros;

public class Quatro extends NumberAsDisplay{
	
	public Quatro(int escala) {
		super(escala);
	}
	
	@Override
	public void montaDisplay(){
		for(int i = 0; i < escala; i ++){
			montaParte1(i);
			montaParte2(i);
		}
		display = parte1 
				+ parte2;
	}

	@Override
	public String montaParte1(int indice) {
		if(indice + 1 == escala){
			return parte1 += "|" + espacosEmBranco.replace(" ", "_") + "|\n"; 
		}
		return parte1 += "|" + espacosEmBranco + "|\n";
	}

	@Override
	public String montaParte2(int indice) {
		return parte2 += " " + espacosEmBranco + "|\n";
	}
	
	@Override
	public String montaParte3(int indice) {
		return "";
	}

}
