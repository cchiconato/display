package numeros;

public abstract class NumberAsDisplay {
	
	protected int escala;
	protected String display = "";
	protected String parte1 = "";
	protected String parte2 = "";
	protected String parte3 = "";
	protected String espacosEmBranco = "";

	public NumberAsDisplay(int escala) {
		this.escala = escala;
		for(int i = 0; i < escala; i ++){
			this.espacosEmBranco += " ";
		}
	}
	
	public abstract void montaDisplay();
	
	public abstract String montaParte1(int indice);
	
	public abstract String montaParte2(int indice);
	
	public abstract String montaParte3(int indice);
	
	public String getDisplay() {
		montaDisplay();
		return display;
	}
}
