package numeros;

public class Tres extends NumberAsDisplay{
	
	public Tres(int escala) {
		super(escala);
	}
	
	@Override
	public void montaDisplay(){
		for(int i = 0; i < escala; i ++){
			montaParte1(i);
			montaParte2(i);
		}
		display = " " + parte1 + "\n"
				+ parte2 
				+ parte2; 
	}

	@Override
	public String montaParte1(int indice) {
		return parte1 += "_";
	}

	
	@Override
	public String montaParte2(int indice) {
		if(indice + 1 == escala){
			return parte2 += " " + parte1 + "|\n";
		}
		return parte2 += " " + espacosEmBranco + "|\n";
	}
	
	@Override
	public String montaParte3(int indice) {
		return "";
	}

}
