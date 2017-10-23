package numeros;

public class Sete extends NumberAsDisplay{
	
	public Sete(int escala) {
		super(escala);
	}
	
	@Override
	public void montaDisplay(){
		for(int i = 0; i < escala; i ++){
			montaParte1(i);
			montaParte2(i);

		}
		display = " " + parte1 + "\n"
				+ parte2;
	}

	@Override
	public String montaParte1(int indice) {
		return parte1 += "_";
	}

	
	@Override
	public String montaParte2(int indice) {
		return parte2 +=  " "  + espacosEmBranco + "|\n";
	}
	
	@Override
	public String montaParte3(int indice) {
		return "";
	}

}
