package numeros;

public class Um extends NumberAsDisplay{
	
	public Um(int escala) {
		super(escala);
	}
	
	@Override
	public void montaDisplay(){
		for(int i = 0; i < escala + 1; i ++){
			display += "|\n";
		}
	}

	@Override
	public String montaParte1(int indice) {
		return "";
	}

	@Override
	public String montaParte2(int indice) {
		return "";
	}

	@Override
	public String montaParte3(int indice) {
		return "";
	}
	
}
